package lesson7;

public class Plate {
    private int food;
    protected static boolean isEating;
    public Plate(int food) {
        this.food = food;
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

    private void emptyFood(int n) {
        System.out.println(n + " еды в тарелке нет");
    }
    public void info() {
        System.out.println("В тарелке осталось:  " + food + " еды");
    }
}
