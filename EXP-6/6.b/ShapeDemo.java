public class ShapeDemo {
    public static void main(String[] args) {
        Shape cylinder = new Cylinder(3, 7);
        Shape sphere = new Sphere(3);
        System.out.printf("Cylinder volume: %.2f, surface area: %.2f%n",
                cylinder.volume(), cylinder.surfaceArea());
        System.out.printf("Sphere volume: %.2f, surface area: %.2f%n",
                sphere.volume(), sphere.surfaceArea());
    }
}
