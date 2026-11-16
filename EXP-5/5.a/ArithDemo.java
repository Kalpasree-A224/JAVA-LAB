import add.Add;
import div.Div;
import mul.Mul;
import sub.Sub;

public class ArithDemo {
    public static void main(String[] args) {
        double first = 20;
        double second = 4;
        System.out.println("Addition: " + Add.calculate(first, second));
        System.out.println("Subtraction: " + Sub.calculate(first, second));
        System.out.println("Multiplication: " + Mul.calculate(first, second));
        System.out.println("Division: " + Div.calculate(first, second));
    }
}
