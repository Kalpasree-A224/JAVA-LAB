public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int first = 32;
        int second = 76;
        int third = 51;
        int largest = Math.max(first, Math.max(second, third));
        System.out.println("Largest number: " + largest);
    }
}
