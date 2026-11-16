import java.util.Arrays;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] values = {42, 17, 8, 31, 23};
        Arrays.sort(values);
        System.out.println("Ascending order: " + Arrays.toString(values));
    }
}
