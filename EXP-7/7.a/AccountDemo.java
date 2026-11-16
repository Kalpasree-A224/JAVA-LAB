public class AccountDemo {
    public static void main(String[] args) {
        SBAccount account = new SBAccount("SB-1042", 1500, 3.5);
        account.deposit(500);
        account.creditInterest();
        account.display();
    }
}
