package lesson6;

public class Dog extends Animal{
    private static int numDogs;
    public static int getNumDogs() {
        return numDogs;
    }

    public Dog(String name,int maxDistance) {
        super(name,maxDistance);
        numDogs++;
    }
    @Override
    public void run(int distance) {
        if (distance>=getMaxDistance())
            super.runLimit(getMaxDistance());
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
