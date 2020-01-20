package lesson3;

import java.util.Scanner;

public class Task {
    private static int score;
    private static Scanner sc = new Scanner(System.in);
    private static String tip ="";
    public static void main(String[] args) {
		/*		* Создать массив из слов
		String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
		При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
		apple – загаданное
		apricot - ответ игрока
		ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
		Для сравнения двух слов посимвольно можно пользоваться:
		String str = "apple";
		char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
		Играем до тех пор, пока игрок не отгадает слово.
		Используем только маленькие буквы.
		*/
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String puzzleWord = words[randomIndexWord()];
        while (!isWin(puzzleWord)) {
            score++;
            compare(puzzleWord, userWord());
        }
        System.out.println("Поздавляем, Вы отгадали загаданое слово: " + puzzleWord );
    }

    private static boolean isWin(String str){
        return str.regionMatches(0, tip, 0, str.length());
    }

    private static void compare(String puzzleWord, String userWord) {

        char[] arr = letterWord(puzzleWord);
        char[] arrUser = letterWord(userWord);
        int minLength = compareLength(arr.length,arrUser.length);
        for (int i = 0; i < minLength; i++) {
            if (arr[i] == arrUser[i])
                tip = tip.concat(String.valueOf(arr[i]));
            else
                tip = tip.concat("#");
        }

        for (int i = 0; i <(15-arr.length); i++)
            tip = tip.concat("#");

        if (!isWin(puzzleWord)){
            System.out.println(tip);
            tip ="";
        }

    }

    private static int compareLength(int a, int b) {
        return Math.min(a, b);
    }

    private static char[] letterWord(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i);
        return arr;
    }
    private static int randomIndexWord() {
        return (int)(Math.random() * 24) ;
    }
    private static String userWord() {

        System.out.println("Компьютер загадал слово, попробуйте угадать!");
        if (score > 1)
            System.out.println("Попробуйте снова");
        return sc.nextLine();
    }
}
