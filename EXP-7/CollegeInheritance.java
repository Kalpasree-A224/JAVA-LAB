class College {
    protected final String collegeName;

    College(String collegeName) {
        this.collegeName = collegeName;
    }

    public void displayCollege() {
        System.out.println("College: " + collegeName);
    }
}

class CollegeDepartment extends College {
    private final String departmentName;

    CollegeDepartment(String collegeName, String departmentName) {
        super(collegeName);
        this.departmentName = departmentName;
    }

    public void displayDepartment() {
        displayCollege();
        System.out.println("Department: " + departmentName);
    }
}

public class CollegeInheritance {
    public static void main(String[] args) {
        new CollegeDepartment("Central College", "Computer Science").displayDepartment();
    }
}
