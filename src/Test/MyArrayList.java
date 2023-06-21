package Test;
/*Колекция - это
Size = x (x это размер коллекции, то есть индекс)
Будет два метода Add и Remove
add - добавляет в коллекцию данные и увеличивает размер (size++)
remove - будет удалять данные
*/
public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;

    public void Add(String element){
        array[size]=element;
        size++;
        if(size == array.length){
            String[] newArrayList = new String[array.length*2];
            for (int i = 0; i < array.length; i++ ){
                newArrayList[i]=array[i];
            }
            array=newArrayList;
        }
    }
}
