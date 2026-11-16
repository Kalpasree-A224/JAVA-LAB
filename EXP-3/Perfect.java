public class Perfect {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        for (int divisor = 1; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                sum += divisor;
            }
        }
        System.out.println(number + (number > 1 && sum == number ? " is perfect" : " is not perfect"));
    }
}
