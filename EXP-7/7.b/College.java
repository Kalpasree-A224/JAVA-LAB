public class College {
    private final String name;
    private final String location;

    public College(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("College: " + name);
        System.out.println("Location: " + location);
    }
}
