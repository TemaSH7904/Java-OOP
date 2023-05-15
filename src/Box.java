//Класс - шаблон, по которму строится объект (Собака - шерсть, порода, размер)
//Объект - реально существующее (Красная коробка, размером 2 на 2)
public class Box {

    double height;
    double length;
    double width;

    Box(){
        this.height = 5;
        this.length = 5;
        this.width = 5;
    }

    Box(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double getVolume() {
        return height * length * width;
    }

    void setDimens(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    void showVolume(){
        System.out.println(getVolume());
    }
}