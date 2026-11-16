public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10;
        long previous = 0;
        long current = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(previous + (i + 1 == terms ? "\n" : " "));
            long next = previous + current;
            previous = current;
            current = next;
        }
    }
}
