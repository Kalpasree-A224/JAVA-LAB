public class Result extends StuDetail implements Exam {
    private final int mark;

    public Result(String name, String registerNumber, String department, int mark) {
        super(name, registerNumber, department);
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        this.mark = mark;
    }

    @Override
    public void displayResult() {
        System.out.println("Mark: " + mark);
        System.out.println("Result: " + (mark >= 40 ? "Pass" : "Fail"));
    }

    public static void main(String[] args) {
        Result result = new Result("Anita", "CS101", "Computer Science", 86);
        result.displayStudentDetails();
        result.displayResult();
    }
}
