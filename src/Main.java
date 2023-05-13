public class Main {
    public static void main(String[] args) {

//    Пример работы с классами и объектами - коробка
//    Box box1 = new Box();
//
//    box1.length = 10;
//    box1.width = 5;
//    box1.height = 2;
//
//    Box box2 = new Box();
//
//    box2.length = 5;
//    box2.width = 5;
//    box2.height = 5;
//
//    box1.showVolume();
//    box2.showVolume();

//    Пример работы с классами и объектами - люди. Несколько людей с полями Имя, Возраст и Вес.
//    Вывод среднего возраста человека

//        Person person1 = new Person();
//        Person person2 = new Person();
//        Person person3 = new Person();
//
//        person1.name = "Artem";
//        person1.age = 23;
//        person1.weight = 69.5;
//
//        person2.name = "Vladimir";
//        person2.age = 17;
//        person2.weight = 60.2;
//
//        person3.name = "Oleg";
//        person3.age = 50;
//        person3.weight = 95.8;
//
//        int avg = (person1.age + person2.age + person3.age)/3;
//
//        System.out.println("Средний возраст людей: "+ avg);

// Пример работы методов с классами и объектами - Собака
        Dog dog1 = new Dog();
        dog1.name = "Jack";
        dog1.breed = "Dachshund";
        dog1.wight = 2;
        dog1.run = 4;

        Dog dog2 = new Dog();
        dog2.name = "Pook";
        dog2.breed = "Bloodhound";
        dog2.wight = 1.5;
        dog2.run = 2;

        System.out.println(dog1.getResult());
        dog1.getRunResult();

        System.out.println(dog2.getResult());
        dog2.getRunResult();
    }
}