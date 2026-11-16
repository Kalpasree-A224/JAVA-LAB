public class VolumeOfCylinderAndSphere {
    public static void main(String[] args) {
        double radius = 3;
        double height = 7;
        double cylinderVolume = Math.PI * radius * radius * height;
        double sphereVolume = (4.0 / 3.0) * Math.PI * radius * radius * radius;
        System.out.printf("Cylinder volume: %.2f%n", cylinderVolume);
        System.out.printf("Sphere volume: %.2f%n", sphereVolume);
    }
}
