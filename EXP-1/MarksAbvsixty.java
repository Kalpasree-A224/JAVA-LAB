public class MarksAbvsixty {
    public static void main(String[] args) {
        int[] marks = {78, 55, 91, 60, 67, 42};
        System.out.println("Marks above 60:");
        for (int mark : marks) {
            if (mark > 60) {
                System.out.println(mark);
            }
        }
    }
}
