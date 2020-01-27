package lesson5;

public class Person {
     String name;
     String post;
     String email;
     long phone;
     int salary;
     int age;
     int id;

    public Person(int id,String name, int age, String post, int salary, long phone, String email) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println("ID: " +id+"\nИмя пользователя: " + name + "\nВозраст: " + age + "\nДолжность: " + post + "\nЗартплата: " + salary + "\nТелефон: +7 9" + phone + "\nEmail: " + email + "\n");
    }
}
