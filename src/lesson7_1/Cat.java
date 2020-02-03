package lesson7_1;

public class Cat {
    private String name;
    private int appetite;
    protected TypeFood typeFoodCat;
    private boolean full;

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isFull() {
        return full;
    }

    public Cat(String name, int appetite, TypeFood typeFood) {
        this.name = name;
        this.appetite = appetite;
        this.typeFoodCat = typeFood;
        this.full = false;
    }
    public void eat(Plate p) {
        while (!isFull()) {

            if (typeFoodCat.equals(p.getTypeFood())){
                p.decreaseFood(appetite);
                if (p.getIsEating()){
                    infoEating(getName());
                    setFull(true);
                } else {
                    p.increaseFood(appetite);
                }
            } else {
                infoEatingType(getName(),p.getTypeFood());
                break;
            }
        }
    }

    private void infoEatingType(String name, TypeFood typeFood) {
        System.out.println("Кот: " + getName() + ", не ест корм: " + typeFood.getType());
    }

    private void infoEating(String name) {
        System.out.println("Кот: " + name + " поел");
    }
    public void info() {
        System.out.println("Кот: " + getName() + ", Ест: " + typeFoodCat.getType() + ", Аппетит: " + getAppetite() + ", Сытый: " + getFull());
    }
    public boolean getFull() {
        return full;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
