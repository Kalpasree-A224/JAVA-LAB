public class StuDetail implements Student {
    private final String name;
    private final String registerNumber;
    private final String department;

    public StuDetail(String name, String registerNumber, String department) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.department = department;
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Register number: " + registerNumber);
        System.out.println("Department: " + department);
    }
}
