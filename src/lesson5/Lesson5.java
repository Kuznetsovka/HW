package lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person(1,"Кузнецов Кирилл", 33 ,"Java разработчик",120000, "+7 916 123 45 67","kk@mail.com");
        persArray[1] = new Person(2,"Пупкин Василий", 18,"Стажер",40000, "+7 916 111 11 11","vp@mail.com");
        persArray[2] = new Person(3,"Пупкина Анна", 52 ,"Дизайнер",70000, "+7 916 222 22 22","ap@mail.com");
        persArray[3] = new Person(4,"Кукушкин Егор", 51 ,"Frontend разработчик",100000, "+7 916 333 33 33","ek@mail.com");
        persArray[4] = new Person(5,"Кукушкина Марианна", 34 ,"Бухгалтер",100000, "+7 916 444 44 44","mk@mail.com");
        for(Person value: persArray)
            if(value.age>50) value.info();
    }
}
