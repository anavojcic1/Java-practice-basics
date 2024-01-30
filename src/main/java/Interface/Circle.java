package Interface;

public class Circle implements ShapeClass {
    public static final double PI = 22.0 / 7.0;
    public double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }
}
