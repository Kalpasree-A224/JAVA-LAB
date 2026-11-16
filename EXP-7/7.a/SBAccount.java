public class SBAccount extends Account {
    private final double annualInterestRate;

    public SBAccount(String accountNumber, double openingBalance, double annualInterestRate) {
        super(accountNumber, openingBalance);
        if (annualInterestRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        this.annualInterestRate = annualInterestRate;
    }

    public void creditInterest() {
        balance += balance * annualInterestRate / 100;
    }
}
