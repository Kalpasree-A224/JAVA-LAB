public class printmarksabove {
    public static void main(String[] args) {
        int[] marks = {65, 48, 73, 60, 88};
        for (int index = 0; index < marks.length; index++) {
            if (marks[index] > 60) {
                System.out.printf("Student %d: %d%n", index + 1, marks[index]);
            }
        }
    }
}
