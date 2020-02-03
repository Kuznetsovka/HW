package lesson7_1;

import java.util.Random;

public class TypeFood {
    protected String type;
    private static String[] arrFood = new String[] {
            "Whiscas",
            "Kitekat",
            "Brit"};
    private static Random typeFoodRandomize = new Random();

    public TypeFood(){
        this.type = arrFood[typeFoodRandomize.nextInt(arrFood.length)];
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
