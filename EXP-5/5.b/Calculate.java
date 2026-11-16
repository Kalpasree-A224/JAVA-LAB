import Shape.Circle;
import Shape.Square;
import Shape.Triangle;

public class Calculate {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Square square = new Square(4);
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.printf("Circle area: %.2f, perimeter: %.2f%n", circle.area(), circle.perimeter());
        System.out.printf("Square area: %.2f, perimeter: %.2f%n", square.area(), square.perimeter());
        System.out.printf("Triangle area: %.2f, perimeter: %.2f%n", triangle.area(), triangle.perimeter());
    }
}
