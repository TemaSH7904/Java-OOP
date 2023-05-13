public class Dog {
    String name;
    String breed;
    double wight;
    int run;

    String getResult(){

        return "\nКличка собаки: "+name + "\nПорода собаки: " + breed + "\nВозраст собаки: "+wight;
    }

    void getRunResult(){
        for (int i = 1; i <= run; i++){
            System.out.println("Бегу");
        }

    }
}
