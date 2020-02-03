package lesson7_1;

import java.util.Random;

public class Lesson7 {
    private static final int CAT_COUNT = 5;
    private static final int PLATE_COUNT = 3;
    private static final int MAX_EAT = 100;
    private static Random appetitRandomize = new Random();
    public static void main(String[] args) {
        int j = 0;
        Cat[] cat = new Cat[CAT_COUNT];
        Plate[] plate = new Plate[PLATE_COUNT];
        for (int i = 0; i < CAT_COUNT; i++) {
        cat[i] = createCat(i);
        cat[i].info();
        while (j < PLATE_COUNT-1 && !cat[i].getFull()) {
            plate[j] = createPlate(j);
            cat[i].eat(plate[j]);
            cat[i].info();
            plate[j].info();
            j++;
        }
        j=0;
        System.out.println("------");
    }
}
    private static Cat createCat(int i) {
        TypeFood typeFoodCat = new TypeFood();
        return new Cat(
                "name" + i,
                appetitRandomize.nextInt(MAX_EAT),
                typeFoodCat);
    }

    private static Plate createPlate(int j) {
        TypeFood typeFoodPlate = new TypeFood();
        return new Plate(
                j,
                appetitRandomize.nextInt(CAT_COUNT * MAX_EAT/2),
                typeFoodPlate);
    }
}
