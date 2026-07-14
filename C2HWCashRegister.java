public class C2HWCashRegister {
    private double purchase;
    private double payment;
    private int itemCount; // Track the number of purchases

    // Constructor
    public C2HWCashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    // Record a purchase and increment the item count
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    // Receive payment
    public void receivePayment(double amount) {
        payment += amount;
    }

    // Give change and reset values
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0; // Reset item count for the next transaction
        return change;
    }

    // Part (a): Instance method to return the number of purchases
    public int getItemCount() {
        return itemCount;
    }

    // Part (b): Static method to count total items across an array of CashRegisters
    public static int countTotal(C2HWCashRegister[] registers) {
        int total = 0;
        for (C2HWCashRegister reg : registers) {
            if (reg != null) { // Safeguard against null elements
                total += reg.getItemCount();
            }
        }
        return total;
    }
}