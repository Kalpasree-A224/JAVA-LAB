public class SubstringsOfAString {
    public static void main(String[] args) {
        String text = "Java";
        for (int start = 0; start < text.length(); start++) {
            for (int end = start + 1; end <= text.length(); end++) {
                System.out.println(text.substring(start, end));
            }
        }
    }
}
