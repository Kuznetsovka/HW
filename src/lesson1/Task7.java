package lesson1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя");
        String name =sc.nextLine();
        hello(name);
        sc.close();
    }
    public static void hello(String name){
        System.out.println("Привет " + name + "!");
    }
}
