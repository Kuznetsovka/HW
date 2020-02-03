package lesson7_1;

public class Plate {
    private int food;
    protected TypeFood typeFood;
    protected static boolean isEating;
    protected int number;
    public Plate(int number,int food,TypeFood typeFood) {
        this.number = number;
        this.food = food;
        this.typeFood = typeFood;
    }
    public void decreaseFood(int n) {
        if (food - n >= 0) {
            food -= n;
            setIsEating(true);
        } else {
            emptyFood(n);
            setIsEating(false);
        }
    }

    private void setIsEating(boolean b) {
        isEating = b;
    }
    public void increaseFood(int n) {
        System.out.println(n + " еды добавлено в тарелку");
        food += n;
    }

    public boolean getIsEating() {
        return isEating;
    }

    public TypeFood getTypeFood() {
        return typeFood;
    }

    public int getFood() {
        return food;
    }

    public int getNumber() {
        return number;
    }

    private void emptyFood(int n) {
        System.out.println(n + " еды в тарелке нет");
    }
    public void info() {
        System.out.println("Тарелка #" + getNumber() + ", Корм: "+ typeFood.getType() + ", В тарелке осталось:  " + getFood() + " еды");
    }
}
