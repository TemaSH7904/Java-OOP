package Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> numName = new ArrayList<>();
        ArrayList<Integer> num = number();
        ArrayList<String> names = names();

    }


    private static ArrayList<Integer> number(){
        ArrayList<Integer> num = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            num.add(i);
        }
        return num;
    }

    private static ArrayList<String> names(){
        ArrayList<String> name = new ArrayList<>();
        name.add("Jhon");
        name.add("Artem");
        name.add("Anton");
        name.add("Max");
        name.add("Natsha");
        return name;
    }

//    Оболочки типов - преобразуют тип String в int, с помощью Integer.parseInt().
//    Substring - позволяет вытащить из строки числа или символы, с помощью указания индекса.
//    public static void main(String[] args) {
//        String sentence = "This is Jhon. He is 27 years old.";
//        String name = sentence.substring(8, 12);
//        String ageString = sentence.substring(20, 22);
//        int age = Integer.parseInt(ageString);
//
//        System.out.println(name + "\n" + age);
//
//        String numString0 = "1000";
//        String numString1 = "2000";
//
//        int numInt0 = Integer.parseInt(numString0);
//        int numInt1 = Integer.parseInt(numString1);
//
//        System.out.println(numString0 + numString1);
//        System.out.println(numInt0 + numInt1 );
//
//        Person person0 = new Person(name, age);
//
//        System.out.println(person0.getName() + "\n" + person0.getAge());

    }


   /*Коллекции.
    // Собственная коллекция ArrayList
    public static void main(String[] args) {
    MyArrayList employees = getEmployees();
    employees.add("Anton");
    employees.remove("Jhon");
    employees.remove(1);

    for(int i = 0; i < employees.getSize(); i++){
        System.out.println(employees.get(i));
    }

    }
    private static MyArrayList getEmployees(){
        MyArrayList employees = new MyArrayList();

        employees.add("Jhon");
        employees.add("Natasha");
        employees.add("Dina");
        employees.add("Artem");
        employees.add("Den");
        return employees;
    }
*/

//
///*
//Коллекции.
//Есть класс с массивом имен

//*/
//        String[] employees = getEmployees();
//        for (String employee : employees) {
//            System.out.println(employee);
//        }
//        System.out.println(MyMath.multiple(5, 6));

//    Пример работы с классами и объектами - коробка
//    Последняя запись является примером работы с конструкторами
        /*
        Использование конструктора выполняется для присваивания данных переменных при инициализации объектов через new,
        а использование методов с this.height=height, выполняется для присвания данных переменным в методу.
        */
//    Examples.Box box1 = new Examples.Box();
//    box1.showVolume();
//
//    Examples.Box box2 = new Examples.Box(10,10,10);
//    box2.showVolume();
//    box2.setDimens(4, 5, 6);

//    Пример работы с классами и объектами - люди. Несколько людей с полями Имя, Возраст и Вес.
//    Вывод среднего возраста человека

//        Examples.Person person1 = new Examples.Person();
//        Examples.Person person2 = new Examples.Person();
//        Examples.Person person3 = new Examples.Person();
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
//        Examples.Dog dog1 = new Examples.Dog();
//        dog1.name = "Jack";
//        dog1.breed = "Dachshund";
//        dog1.wight = 2;
//        dog1.run = 4;
//
//        Examples.Dog dog2 = new Examples.Dog();
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


// Пример работы с передачей переменных в класс Examples.Rectangle (Прямоугольник) и вызов метода для вывода площади прямогульника.
//        Examples.Rectangle rectangle = new Examples.Rectangle();
//        rectangle.setDimens(5,5);
//        rectangle.showResult();
// Использование конструктора
//    Examples.Worker worker = new Examples.Worker("Artem", "General Manager", 1000000);
//    worker.showInfo();


// Использование перегрузки методов.
/*Использование static в классе Math позваляет
обращаться к методу без создания объекта*/
//    Examples.MyMath myMath = new Examples.MyMath();
//        System.out.println(myMath.multiple("Привет"));
//        System.out.println(myMath.multiple(5,5));
//        System.out.println(myMath.multiple(5.5, 5.5));

/* Использование созданных методов. Их можно найти в документации.
Например для вызова таких методов обратимся к классу Math. Использование
метода max у класса Math - выводом будет большее из двух чисел*/
//        System.out.println(Math.max(100, 101));

    //Мостр 1 - без указания количества глаз, рук и ног, выводом voice.
//        Examples.Monster monster = new Examples.Monster();
//        System.out.println(
//                "Монстр 1:"+
//                "\nКол-во глаз: "+monster.eye+
//                "\nКол-во рук: "+monster.hands+
//                "\nКол-во ног: "+monster.foot
//        );
//        monster.voice();

    //Монстр 2 - с указанием одинакого количества глаз, рук и ног, выводом voice.
//        Examples.Monster monster = new Examples.Monster(3);
//                System.out.println(
//                "Монстр 2:"+
//                "\nКол-во глаз: "+monster.eye+
//                "\nКол-во рук: "+monster.hands+
//                "\nКол-во ног: "+monster.foot
//                );
//        monster.voice(3);

    //Монстр 3 - с указанием количества глаз, рук и ног, выводом voice.
//        Examples.Monster monster = new Examples.Monster(1,4,2);
//        System.out.println(
//                "Монстр 3:"+
//                        "\nКол-во глаз: "+monster.eye+
//                        "\nКол-во рук: "+monster.hands+
//                        "\nКол-во ног: "+monster.foot
//        );
//        monster.voice(5,"Hiiiiiii");

// Пример работы с модификаторами доступа с помощью Set-ов и Get-ов.
/*
Set-ры используются для присваивания значений внутри класса, а  Get-ры для вызова переменых в другой класс.
*/
//        Person person = new Person("Artem", 23);//Присваивание значений через конструктор
//        person.setAge(-5); /*Присваивание значений переменной через Set-ры, в этом методе используется проверка
//         на значение (>=0), иначе присвоиться значение из конструктора */
//        System.out.println("Name: "+ person.getName()+"\nAge person: "+person.getAge()); //Вызов переменных

    //}
    //"Внешний класс с массивом, в котором хранятся имена"
//    public static String[] getEmployees(){
//        String[] employees = new String[5];
//        employees[0] = "Nick";
//        employees[1] = "Karl";
//        employees[2] = "Sasha";
//        employees[3] = "Alex";
//        employees[4] = "Max";
//        return employees;
//    }
