package Examples;

public class Worker {
    String name;
    String position;
    double salary;

    Worker(String name, String position, double salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    void showInfo(){
        System.out.println(
                "Examples.Worker name: " + name +
                "\nExamples.Worker position: " + position +
                "\nExamples.Worker salary: " + salary + " $"
                );
    }

}
