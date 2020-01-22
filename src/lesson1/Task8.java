package lesson1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        //Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
        Scanner sc = new Scanner(System.in);
        int year;
        do {
            System.out.println("Введите год");
            year =sc.nextInt();
            if (year<=0) System.out.println("Год не может быть отрицательным.Введите положительное число.");
        }while (year<0);

        whatYear(year);
        sc.close();
    }
    public static void whatYear(int year){
        if (year%400==0)
            System.out.println("високосный");
        else if (year%4!=0 || year%100==0)
            System.out.println("невисокосный");
        else
            System.out.println("високосный");
    }
}
