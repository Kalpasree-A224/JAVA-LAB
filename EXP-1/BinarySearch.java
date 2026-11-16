import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] values = {4, 9, 15, 22, 38, 51};
        int target = 22;
        int index = Arrays.binarySearch(values, target);
        System.out.println("Array: " + Arrays.toString(values));
        System.out.println(target + (index >= 0 ? " found at index " + index : " not found"));
    }
}
