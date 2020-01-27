package lesson5;

public class Person {
    private String name;
    private String post;
    private String email;
    private long phone;
    private int salary;
    private int age;
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Кузнецов Кирилл", 33 ,"Java разработчик",120000, 161234567,"kk@mail.com");
        persArray[1] = new Person("Пупкин Василий", 18,"Стажер",40000, 16437476,"vp@mail.com");
        persArray[2] = new Person("Пупкина Анна", 52 ,"Дизайнер",70000, 162222222,"ap@mail.com");
        persArray[3] = new Person("Кукушкин Егор", 51 ,"Frontend разработчик",100000, 163333333,"ek@mail.com");
        persArray[4] = new Person("Кукушкина Марианна", 34 ,"Бухгалтер",100000, 164444444,"mk@mail.com");
        for(Person value: persArray)
            if(value.age>50) value.info();
    }
    public Person(String name, int age, String post, int salary, long phone, String email) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя пользователя: " + name + "\nВозраст: " + age + "\nДолжность: " + post + "\nЗартплата: " + salary + "\nТелефон: +7 9" + phone + "\nEmail: " + email + "\n");
    }
}
