package Examples;

//Класс - шаблон, по которму строится объект (Собака - шерсть, порода, размер)
//Объект - реально существующее (Красная коробка, размером 2 на 2)
public class Box {

    private double height;
    private double length;
    private double width;

    public Box(){
        this.height = 5;
        this.length = 5;
        this.width = 5;
    }

    public Box(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    double getVolume() {
        return height * length * width;
    }

    public void setDimens(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public void showVolume(){
        System.out.println(getVolume());
    }
}