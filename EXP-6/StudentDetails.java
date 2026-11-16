public class StudentDetails {
    private final String name;
    private final String registerNumber;
    private final int mark;

    public StudentDetails(String name, String registerNumber, int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        this.name = name;
        this.registerNumber = registerNumber;
        this.mark = mark;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Register number: " + registerNumber);
        System.out.println("Mark: " + mark);
    }

    public static void main(String[] args) {
        new StudentDetails("Anita", "CS101", 86).display();
    }
}
