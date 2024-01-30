package Interface;

class Square implements ShapeClass {
    double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * 4;
    }

    @Override
    public double calculatePerimeter() {
    return side * side;
    }
}

