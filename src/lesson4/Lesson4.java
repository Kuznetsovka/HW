package lesson4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static int exit;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void  main(String[] args) {
        createMap();
        printMap();
        while (exit!=1) {
            if(!isMove("Человек")) break;
            if (exit ==1) break;
            if(!isMove("Искуственный Интеллект")) break;
            if (exit ==1) break;
        }
        System.out.println("Игра окончена");	}

    private static boolean isMove(String txt) {
        char chr;

        if (txt.equals("Человек")){
            humanTries();
            chr = DOT_X;
        } else {
            aiTries();
            chr = DOT_O;
        }
        printMap();
        if (checkWin(chr)) {
            System.out.println("Победил " + txt);
            return false;
        }
        if (isMapFull()) {
            System.out.println("Ничья");
            return false;
        }
        return true;
    }

    public static void createMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(ind(i) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static int ind(int i) {
        return i+1;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTries() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        System.out.println("Компьютер походил в точку " + ind(x) + " " + ind(y));
        map[y][x] = DOT_O;
    }

    public static void humanTries() {
        int x, y;
        do {
            System.out.println("Если хотите выйти из игры, в любой момент введите, esc");
            x = enterXY('X');
            if (exit==1) return;
            y = enterXY('Y');
            if (exit==1) return;

        } while (!isCellEmpty(x, y));
        map[y][x] = DOT_X;
    }

    private static int enterXY(char chr) {
        System.out.println("Введите координату " + chr);
        try {
        if (!sc.hasNextInt()){
            if (sc.nextLine().equals("esc")) {
                exit = 1;
                return 100;
            }
            } else {
                return sc.nextInt()-1;
            }
        } catch (InputMismatchException e) {
            //
        }
        return 100;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return (map[y][x] == DOT_EMPTY);
    }

    public static boolean checkWin(char chr) {
        int count1 = 0;
        int countDia1 = 0;
        int count2 = 0;
        int countDia2 = 0;
        char[][] arr = map;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (arr[i][j] == chr) count1++;
                if (arr[j][j] == chr && i == j) countDia1++;
                if (arr[j][i] == chr) count2++;
                if (arr[i][i] == chr && i == j) countDia2++;
            }
        }
        if (count1 == DOTS_TO_WIN) return true;
        if (countDia1 == DOTS_TO_WIN) return true;
        if (count2 == DOTS_TO_WIN) return true;
        if (countDia2 == DOTS_TO_WIN) return true;
        return false;
    }
// Ниже второй рабочий вариант оценки победы. Какой вариант лучше? Тут кода и условий меньше, но добавляется еще один метод и цикл, хотя и с прерывателем.
    /*  public static boolean checkWin(char chr) {
       int count = 0;
       int countDia = 0;
       char[][] arr = map;
       for (int tries = 0; tries < 3; tries++){
           for (int i = 0; i < SIZE; i++) {
               for (int j = 0; j < SIZE; j++) {
                   if (arr[i][j] == chr) count++;
                   if (arr[j][j] == chr && i==j) countDia++;
               }
               if (count == DOTS_TO_WIN) return true; else count = 0;
           }
           if (countDia == DOTS_TO_WIN) return true; else countDia = 0;
           arr = rotateMap(map);
       }
       return false;
   }

    private static char[][] rotateMap(char[][] map) {
        char[][] result = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                result[i][j] = map[SIZE - j - 1][i];
            }
        }
        return result;
    }

   */
}