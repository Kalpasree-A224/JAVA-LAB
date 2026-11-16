public class ReverseNumber {
    public static void main(String[] args) {
        int number = 4826;
        int remaining = Math.abs(number);
        int reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        if (number < 0) {
            reversed = -reversed;
        }
        System.out.println("Reverse of " + number + " is " + reversed);
    }
}
