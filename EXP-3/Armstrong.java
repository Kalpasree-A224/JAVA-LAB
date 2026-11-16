public class Armstrong {
    public static void main(String[] args) {
        int number = 153;
        int digits = String.valueOf(number).length();
        int remaining = number;
        int sum = 0;
        do {
            int digit = remaining % 10;
            sum += (int) Math.pow(digit, digits);
            remaining /= 10;
        } while (remaining > 0);

        System.out.println(number + (sum == number ? " is an Armstrong number" : " is not an Armstrong number"));
    }
}
