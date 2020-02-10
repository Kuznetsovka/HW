package lesson6;

public class Cat extends Animal{
    static int numCats;

    public Cat(String name,int maxDistance) {
        super(name,maxDistance);
        numCats++;
    }

    @Override
    public void run(int distance) {
        if (distance>=getMaxDistance())
            super.runLimit(getMaxDistance());
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
