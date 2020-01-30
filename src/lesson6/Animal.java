package lesson6;

public abstract class Animal {
    protected String name;
    private static int numAnimals;
    private int maxDistance;

    public Animal(String name) {
        this.name = name;
        numAnimals++;
    }

    public void swim(int distance){
        System.out.println( name + " проплыл " + distance + " м" );
    }

    public void run(int distance) {
            System.out.println( name + " пробежал " + distance + " м" );
    }
    public void runLimit(int distance,int maxDistance){
            System.out.println(name + " не может пробежать больше " + maxDistance + " м" );
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumAnimals() {
        return numAnimals;
    }

    public static void setNumAnimals(int numAnimals) {
        Animal.numAnimals = numAnimals;
    }
}