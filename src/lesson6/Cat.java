package lesson6;

public class Cat extends Animal{
    protected String name;
    static int numCats;

    public Cat(String name) {
        super(name);
        numCats++;
    }

    @Override
    public void run(int distance) {
        final int maxDistance = 200;
        if (distance>=maxDistance)
            super.runLimit(distance,maxDistance);
        else
            super.run(distance);
    }
    public void swim(int distance) {
            System.out.println( getName() + " не умеет плавать");
    }

    public static int getNumCats() {
        return numCats;
    }

}
