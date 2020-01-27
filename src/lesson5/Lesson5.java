package lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person(1,"Кузнецов Кирилл", 33 ,"Java разработчик",120000, 161234567,"kk@mail.com");
        persArray[1] = new Person(2,"Пупкин Василий", 18,"Стажер",40000, 16437476,"vp@mail.com");
        persArray[2] = new Person(3,"Пупкина Анна", 52 ,"Дизайнер",70000, 162222222,"ap@mail.com");
        persArray[3] = new Person(4,"Кукушкин Егор", 51 ,"Frontend разработчик",100000, 163333333,"ek@mail.com");
        persArray[4] = new Person(5,"Кукушкина Марианна", 34 ,"Бухгалтер",100000, 164444444,"mk@mail.com");
        for(Person value: persArray)
            if(value.age>50) value.info();
    }
}
