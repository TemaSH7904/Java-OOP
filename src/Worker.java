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
                "Worker name: " + name +
                "\nWorker position: " + position +
                "\nWorker salary: " + salary + " $"
                );
    }

}
