package Interface;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c = new Circle(15);
        System.out.println("The area of circle is " + c.calculateArea());
        System.out.println("The perimeter of circle is " + c.calculatePerimeter());

        System.out.println();

        Square s = new Square(10);
        System.out.println("The area of square is " + s.calculateArea());
        System.out.println("The perimeter of square is " + s.calculatePerimeter());

    }
}
