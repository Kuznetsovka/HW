package lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println(negativity(a));
        sc.close();
    }
    public static boolean negativity(int a){
        if (a<0)
            return true;
        else
            return false;
    }
}
