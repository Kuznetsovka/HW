package lesson7;

import java.util.Random;

public class Main {
    private static final int CAT_COUNT = 5;
    private static Random appetitRandomize = new Random();
    public static void main(String[] args) {
        Cat[] cat = new Cat[CAT_COUNT];
        Plate plate = new Plate(CAT_COUNT * 50);
        for (int i = 0; i < CAT_COUNT; i++) {
            cat[i] = createCat(i);
            cat[i].info();
            plate.info();
            cat[i].eat(plate);
            cat[i].info();
            plate.info();
            System.out.println("------");
        }
    }
    private static Cat createCat(int i) {

        return new Cat(
                "name" + i,
                appetitRandomize.nextInt(110));
    }
}
