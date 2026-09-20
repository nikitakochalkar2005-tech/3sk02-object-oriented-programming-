
class ObjectOrientedCode {

    private double accountBalance = 1000.0;
    private final String customerName = "Nikita";

    void withdraw(double amount) {
        if (amount > 0 && amount <= accountBalance) {
            this.accountBalance -= amount;
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }

    }

    void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
        } else {
            System.out.println("invalid amount:");
        }
    }

    public static void main(String args[]) {
        ObjectOrientedCode nikitaAccount = new ObjectOrientedCode();
        nikitaAccount.withdraw(500.0);
        nikitaAccount.deposit(1000.0);
        System.out.println("valid withdraw balance:" + nikitaAccount.accountBalance);
    }
}
