class BasicAccount {
    protected final String holder;
    protected double balance;

    BasicAccount(String holder, double openingBalance) {
        this.holder = holder;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void display() {
        System.out.printf("%s: balance %.2f%n", holder, balance);
    }
}

class SavingsAccount extends BasicAccount {
    private final double interestRate;

    SavingsAccount(String holder, double openingBalance, double interestRate) {
        super(holder, openingBalance);
        if (interestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.interestRate = interestRate;
    }

    public void addAnnualInterest() {
        balance += balance * interestRate / 100;
    }
}

public class AccountInheritance {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("Ravi", 1000, 4);
        account.deposit(250);
        account.addAnnualInterest();
        account.display();
    }
}
