package lesson6;

public class Cat extends Animal{
    static int numCats;

    public Cat(String name) {
        super(name);
        numCats++;
    }

    @Override
    public void run(int distance) {
        final int maxDistance = 200;
        if (distance>=maxDistance)
            super.runLimit(maxDistance);
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
