package lesson7_1;

import java.util.Random;

public class Lesson7 {
    private static final int CAT_COUNT = 5;
    private static final int PLATE_COUNT = 3;
    private static final int MAX_EAT = 100;
    private static Random appetitRandomize = new Random();
    public static void main(String[] args) {
        Cat[] cat = new Cat[CAT_COUNT];
        Plate[] plate = new Plate[PLATE_COUNT];
        for (int i = 0; i < PLATE_COUNT; i++) {
            plate[i] = createPlate(i);
            System.out.println(plate[i]);
        }
        infoSplit();
        for (int i = 0; i < CAT_COUNT; i++) {
            cat[i] = createCat(i);
            processEating(cat[i], plate);
            infoSplit();
        }
        for (int i = 0; i < CAT_COUNT; i++)
            System.out.println(cat[i]);
        for (int i = 0; i < PLATE_COUNT; i++)
            System.out.println(plate[i]);
    }

    private static void infoSplit() {
        System.out.println("------");
    }
    private static void processEating(Cat cat, Plate[] plate) {
        int i = 0;
        while (isGoEating(i,cat)) {
            cat.eat(plate[i]);
            cat.info();
            System.out.println(plate[i]);
            i++;
            if (isGoEating(i,cat))
                System.out.println("---");
        }
    }
    private static boolean isGoEating(int i,Cat cat) {
        return (i < PLATE_COUNT && !cat.getFull());
    }

    private static Cat createCat(int i) {
        TypeFood typeFoodCat = new TypeFood();
        return new Cat(
                "Кот #" + (i + 1),
                appetitRandomize.nextInt(MAX_EAT),
                typeFoodCat);
    }

    private static Plate createPlate(int j) {
        TypeFood typeFoodPlate = new TypeFood();
        return new Plate(
                j,
                appetitRandomize.nextInt(CAT_COUNT * MAX_EAT * 2),
                typeFoodPlate);
    }

}