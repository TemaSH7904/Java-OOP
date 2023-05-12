public class Main {
    public static void main(String[] args) {

    Box box1 = new Box();

    box1.Length = 10.0;
    box1.Width = 5.0;
    box1.Height = 2.0;

    double result;

    result = box1.Length* box1.Width* box1.Height;

    System.out.println(result);

    }
}