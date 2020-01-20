package lesson1;
import java.util.Scanner;
public class Task4 {
        public static void main(String[ ] args) {
            //Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
            Scanner sc = new Scanner(System.in);
            int a = writetext(sc);
            int b = writetext(sc);

            System.out.println(check( a,b) );
            sc.close( );
        }
        public static boolean check( int a, int b){
            int sum = a+b;
            if(sum >= 10 && sum <= 20 ){
                return true;
            } else {
                return false;
            }
        }
        public static int writetext(Scanner sc){
            System.out.println("Введите число");
            int num = sc.nextInt();
            return num;
        }
}

