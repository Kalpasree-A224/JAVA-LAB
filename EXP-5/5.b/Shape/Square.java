package Shape;

public class Square {
    private final double side;

    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("Side cannot be negative");
        }
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return 4 * side;
    }
}
