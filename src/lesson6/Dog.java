package lesson6;

public class Dog extends Animal{
    private String name;
    private static int numDogs;

    public static int getNumDogs() {
        return numDogs;
    }

    public static void setNumDogs(int numDogs) {
        Dog.numDogs = numDogs;
    }

    public Dog(String name) {
        super(name);
        numDogs++;
    }
    @Override
    public void run(int distance) {
        final int maxDistance = 500;
        if (distance>=maxDistance)
            super.runLimit(distance,maxDistance);
        else
            super.run(distance);
    }

    public void swim(int distance) {
        final int maxDistance = 10;
        if (distance>=maxDistance)
            System.out.println( getName() + " не может проплыть больше " + maxDistance + " м" );
        else
            super.run(distance);
    }
}
