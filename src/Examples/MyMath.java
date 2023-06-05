package Examples;

//Изучение темы "Перегрузка методов". Использование одного метода с разными типами данных - int, double...
//Изучение темы "Ключивые слова static, final и аргументы переменной длины".
/*
Static - используется чтобы передавать переменные и использовать методы класса без создания объекта (Методы можно
 вызвать используя название класса).
Final - используется для объявления констант (Имя переменной пишется с CAPS).
*/
public class MyMath {

    public static final double PI = 3.14;
    public static double length(double radius){
        return 2 * PI * radius;
    }
    public static int multiple(int a, int b){
        return a * b;
    }

    public static double multiple(double a, double b){
        return a * b;
    }

    public static String multiple(String a){
        return a;
    }
}
