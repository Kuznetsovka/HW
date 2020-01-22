package lesson1;

public class Task3 {
    public static void main(String[ ] args) {
        System.out.println(mathOperator( 2 , 4.7 , 14 , 7 ) );
    }
    private static double mathOperator(double a, double b, double c, double d){
        //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метод
        return a * (b + (c / d));
    }
}
