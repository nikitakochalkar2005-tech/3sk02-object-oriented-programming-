
class Account {

    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingAccount extends Account {

    double insertRate;

    SavingAccount(int accountNumber, double balance, double insertRate) {
        super(accountNumber, balance);
        this.insertRate = insertRate;
    }

}

class PremiumSavingAccount extends SavingAccount {

    double bonusPoint;

    PremiumSavingAccount(int accountNumber, double balance, double bonusPoint, double insertRate) {
        super(accountNumber, balance, insertRate);
        this.bonusPoint = bonusPoint;
    }

    void displayDetails() {
        System.out.println("account number is:" + accountNumber);
        System.out.println("account balance is:" + balance);
        System.out.println("bonus point is:" + bonusPoint);
        System.out.println("interest rate is:" + insertRate);
    }
}

class BankApp {

    public static void main(String args[]) {
      //  SavingAccount savingaccount = new SavingAccount(453, 90679, 65);
        PremiumSavingAccount premiumsavingaccount = new PremiumSavingAccount(4536, 9067990, 655, 65);
        premiumsavingaccount.displayDetails();

    }
}
