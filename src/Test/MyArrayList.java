//package Test;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//public class MyArrayList {
//
//    //Создали массив "array" типа String
//    private String[] array = new String[10];
//    //Создали переменую для размера коллекции
//    private int size = 0;
//
//    public String get(int index){
//        return array[index];
//    }
//
//    //*Создадим методы для добавления "add", удаления(по индексу и по имени) "remove" и метод которые будет
//    // увеличивать размер коллекции в 2 раза .
//    // *//
//
//    public void add(String element){
//        array[size] = element;
//        size++;
//
//        if(size == array.length){
//            String[] newArray = new String[array.length * 2];
//
//            for (int i = 0; i < array.length; i++){
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//    }
//    // Создали метод remove для удаления записей. Будет использоваться перегрузка метода по индексу и строке.
//    public void remove(int index){
//        for(int i = index; i < size - 1; i++){
//            array[i]=array[i+1];
//        }
//        array[size]=null;
//        size--;
//    }
//    public  void remove(String element){
//        for(int i = 0; i < array.length; i++){
//            if (element.equals(array[i])){
//                remove(i);
//                return;
//            }
//        }
//    }
//
//    public int getSize() {
//        return size;
//    }
//}
