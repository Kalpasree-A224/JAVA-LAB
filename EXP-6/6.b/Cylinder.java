public class Cylinder extends CylinderShape {
    public Cylinder(double radius, double height) {
        super(radius, height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
