public class Main {
    public static void main(String[] args) {

//    Пример работы с классами и объектами - коробка
//    Последняя запись является примером работы с конструкторами
        /*
        Использование конструктора выполняется для присваивания данных переменных при инициализации объектов через new,
        а использование методов с this.height=height, выполняется для присвания данных переменным в методу.
        */
//    Box box1 = new Box();
//    box1.showVolume();
//
//    Box box2 = new Box(10,10,10);
//    box2.showVolume();
//    box2.setDimens(4, 5, 6);


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
//        Dog dog1 = new Dog();
//        dog1.name = "Jack";
//        dog1.breed = "Dachshund";
//        dog1.wight = 2;
//        dog1.run = 4;
//
//        Dog dog2 = new Dog();
//        dog2.name = "Pook";
//        dog2.breed = "Bloodhound";
//        dog2.wight = 1.5;
//        dog2.run = 2;
//
//        System.out.println(dog1.getResult());
//        dog1.getRunResult();
//
//        System.out.println(dog2.getResult());
//        dog2.getRunResult();


// Пример работы с передачей переменных в класс Rectangle (Прямоугольник) и вызов метода для вывода площади прямогульника.
//        Rectangle rectangle = new Rectangle();
//        rectangle.setDimens(5,5);
//        rectangle.showResult();
// Использование конструктора
//    Worker worker = new Worker("Artem", "General Manager", 1000000);
//    worker.showInfo();


// Использование перегрузки методов.
/*Использование static в классе Math позваляет
обращаться к методу без создания объекта*/
//    MyMath myMath = new MyMath();
//        System.out.println(myMath.multiple("Привет"));
//        System.out.println(myMath.multiple(5,5));
//        System.out.println(myMath.multiple(5.5, 5.5));

/* Использование созданных методов. Их можно найти в документации.
Например для вызова таких методов обратимся к классу Math. Использование
метода max у класса Math - выводом будет большее из двух чисел*/
//        System.out.println(Math.max(100, 101));

        //Мостр 1 - без указания количества глаз, рук и ног, выводом voice.
//        Monster monster = new Monster();
//        System.out.println(
//                "Монстр 1:"+
//                "\nКол-во глаз: "+monster.eye+
//                "\nКол-во рук: "+monster.hands+
//                "\nКол-во ног: "+monster.foot
//        );
//        monster.voice();

        //Монстр 2 - с указанием одинакого количества глаз, рук и ног, выводом voice.
//        Monster monster = new Monster(3);
//                System.out.println(
//                "Монстр 2:"+
//                "\nКол-во глаз: "+monster.eye+
//                "\nКол-во рук: "+monster.hands+
//                "\nКол-во ног: "+monster.foot
//                );
//        monster.voice(3);

       //Монстр 3 - с указанием количества глаз, рук и ног, выводом voice.
//        Monster monster = new Monster(1,4,2);
//        System.out.println(
//                "Монстр 3:"+
//                        "\nКол-во глаз: "+monster.eye+
//                        "\nКол-во рук: "+monster.hands+
//                        "\nКол-во ног: "+monster.foot
//        );
//        monster.voice(5,"Hiiiiiii");
    }
}