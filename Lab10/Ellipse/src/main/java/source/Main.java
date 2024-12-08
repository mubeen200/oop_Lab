package source;

public class Main {
    public static void main(String[] args) {
        Shape sq1 = new Square(10);
        Shape el1 = new Ellipse(10 , 7);
        Shape circ1 = new Circle(5);
        System.out.println(sq1.toString());
        System.out.println(el1.toString());
        System.out.println(circ1.toString());

    }
}