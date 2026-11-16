public class LargestSmallest {
    public static void main(String[] args) {
        int[] values = {34, 12, 87, 5, 49};
        int smallest = values[0];
        int largest = values[0];

        for (int value : values) {
            if (value < smallest) {
                smallest = value;
            }
            if (value > largest) {
                largest = value;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
    }
}
