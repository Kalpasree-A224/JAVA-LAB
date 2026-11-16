public class Account {
    private final String accountNumber;
    protected double balance;

    public Account(String accountNumber, double openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative");
        }
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void display() {
        System.out.printf("Account %s balance: %.2f%n", accountNumber, balance);
    }
}
