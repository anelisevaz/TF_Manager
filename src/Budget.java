public class Budget {
    private double totalAmount;

    public Budget(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Budget() {
        this.totalAmount = 1000;
    }

    public void increaseBudget(double amount) {
        totalAmount += amount;
    }

    public void increaseBudget() {
        totalAmount += 500;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}