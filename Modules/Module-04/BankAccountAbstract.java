 abstract class BankAccount {
 
     String accountHolderName;
     double accountBalance;
         BankAccount(String Name,double balance){
            this.accountHolderName = Name;
            System.out.println("account holder name is = "+accountHolderName);
            this.accountBalance = balance;
            System.out.println("your account balance is = "+ accountBalance);
        }
        
    abstract  void calculateAccountInterest();

}
class savingAccount extends BankAccount{
    savingAccount(String name, double balance){
        super(name, balance);
    }
    void calculateAccountInterest(){
        System.out.println("saving account having interest = "+ accountBalance * 0.4);
    }
}


class  currentAccount extends BankAccount{
    currentAccount( String name, double balance){
        super(name, balance);
    }
    void calculateAccountInterest(){
        System.out.println("current account having zero interest");
    }

}

class BankAccountAbstract{
    public static void main(String args[]){
        savingAccount savingaccount = new savingAccount("nikita", 100);
        savingaccount.calculateAccountInterest();
        currentAccount currentaccount = new currentAccount("nilima",200);
        currentaccount.calculateAccountInterest();
    }
}
