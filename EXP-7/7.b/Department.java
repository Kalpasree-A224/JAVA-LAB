public class Department extends College {
    private final String departmentName;

    public Department(String name, String location, String departmentName) {
        super(name, location);
        this.departmentName = departmentName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + departmentName);
    }
}
