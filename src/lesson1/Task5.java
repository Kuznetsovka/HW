package lesson1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        positivity(a);
        sc.close();
    }
    public static void positivity(int a){
        if (a>=0)
            System.out. println("Введенное число положительное");
        else
            System.out. println("Введенное число отрицательное");
    }
}
