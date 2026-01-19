public class Payment {
    private final double amount;

    public Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Payment amount must be positive");
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
