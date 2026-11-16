package div;

public class Div {
    public static double calculate(double first, double second) {
        if (second == 0) {
            throw new IllegalArgumentException("The divisor must not be zero");
        }
        return first / second;
    }
}
