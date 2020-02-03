package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;
    }
    public void eat(Plate p) {
        while (!getFull()) {
            p.decreaseFood(appetite);
            if (p.getIsEating()){
                infoEating(getName());
                setFull(true);
            } else {
                p.increaseFood(appetite);
            }
        }
    }
    private void infoEating(String name) {
        System.out.println("Кот: " + name + " поел");
    }
    public void info() {
        System.out.println(name + ", Аппетит: " + appetite + ", Сытость: " + full);
    }
    public boolean getFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public String getName() {
        return name;
    }
}
