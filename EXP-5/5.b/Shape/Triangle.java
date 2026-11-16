package Shape;

public class Triangle {
    private final double firstSide;
    private final double secondSide;
    private final double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide) {
        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0
                || firstSide + secondSide <= thirdSide
                || firstSide + thirdSide <= secondSide
                || secondSide + thirdSide <= firstSide) {
            throw new IllegalArgumentException("Sides must form a valid triangle");
        }
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter
                * (semiperimeter - firstSide)
                * (semiperimeter - secondSide)
                * (semiperimeter - thirdSide));
    }

    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
