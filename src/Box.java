//Класс - шаблон, по которму строится объект (Собака - шерсть, порода, размер)
//Объект - реально существующее (Красная коробка, размером 2 на 2)
public class Box {

    Double height;
    Double length;
    Double width;
    double getVolume(){
        return height * length * width;
    }

    void showVolume(){
        System.out.println(getVolume());
    }
}