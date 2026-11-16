public abstract class CylinderShape implements Shape {
    protected final double radius;
    protected final double height;

    protected CylinderShape(double radius, double height) {
        if (radius < 0 || height < 0) {
            throw new IllegalArgumentException("Dimensions cannot be negative");
        }
        this.radius = radius;
        this.height = height;
    }
}
