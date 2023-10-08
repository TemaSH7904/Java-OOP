package Examples;

//Класс - шаблон, по которму строится объект (Собака - шерсть, порода, размер)
//Объект - реально существующее (Красная коробка, размером 2 на 2)
public class Box {

    private double height;
    private double length;
    private double width;

    public Box(){
        this(10);
    }

    public void Show(){
        System.out.println("Высота - " + width + " Ширина - " + height + " Длина - " + length);
    }

    public Box(double length, double height, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public Box(double size){
        this(size, size, size);
    }

    public void setDimens(double height, double length, double width){
        this.height = height;
        this.length = length;
        this.width = width;
    }

}