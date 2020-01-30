package lesson6;

public class lesson6 {
    public static void main(String[] args) {
        // С помощью ООП никогда не писал, только читал. Поэтому прощупываю!
        Cat Cat1 = new Cat("Мурзик");
        Cat1.run(100);
        Cat1.swim(500);
        Cat1.run(1000);
        Cat Cat2 = new Cat("Васька");
        Cat2.run(10);
        Cat2.swim(10);
        Cat2.run(500);
        Cat2.run(50);
        Dog Dog1 = new Dog ("Барбос");
        Dog1.run(300);
        Dog1.swim(9);
        Dog Dog2 = new Dog ("Бобик");
        Dog2.run(250);
        Dog2.swim(100);
        System.out.println(Dog.getNumDogs());
        System.out.println(Cat.getNumCats());
        System.out.println(Animal.getNumAnimals());
    }

}
