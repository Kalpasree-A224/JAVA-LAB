public class EvenOddSwitch {
    public static void main(String[] args) {
        int number = 17;
        switch (Math.abs(number % 2)) {
            case 0:
                System.out.println(number + " is even");
                break;
            default:
                System.out.println(number + " is odd");
        }
    }
}
