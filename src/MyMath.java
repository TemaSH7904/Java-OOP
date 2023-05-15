//Изучение темы "Перегрузка методов". Использование одного метода с разными типами данных - int, double...
public class MyMath {

    static int multiple(int a, int b){
        return a * b;
    }

    static double multiple(double a, double b){
        return a * b;
    }

    static String multiple(String a){
        return a;
    }
}
