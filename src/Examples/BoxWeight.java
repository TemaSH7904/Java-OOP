package Examples;

public class BoxWeight extends Box {

    private double weight;
    public BoxWeight() {
        this.weight = 10;
    }

    public BoxWeight(double length, double height, double width, double weight) {
        super(length, height, width);
        this.weight = weight;
    }

    public BoxWeight(double size, double weight) {
        super(size);
        this.weight = weight;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Вес - " + weight);
    }
}
