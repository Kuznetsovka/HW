package lesson7_1;

public class Cat {
    private String name;
    private int appetite;
    protected TypeFood typeFood;
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
        this.typeFood = typeFood;
        this.full = false;
    }
    public void eat(Plate p) {
        while (!isFull()) {

            if (getStrTypeF().equals(p.getStrTypeF())){
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
        System.out.println("Кот: " + getName() + ", Сытость: " + getFull());
    }
    public String toString(){
        return getName() + ", Ест: " + typeFood.getType() + ", Аппетит: " + getAppetite() + ", Сытость: " + getFull();
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

    public String getStrTypeF() {
        return typeFood.getType();
    }
}