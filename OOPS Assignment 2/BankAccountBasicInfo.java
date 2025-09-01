class Account{
    String name;
    double balance;

    Account(String name, double balance){
        this.name=name;
        this.balance=balance;
    }

    double getBalance(){
        return this.balance;
    }

    void setBalance(double balance){
        this.balance=balance;
    }
}

public class BankAccountBasicInfo {
    public static void main(String argz[]){
        Account a1 = new Account("Custom1", 1000.0);
        a1.setBalance(1500.50);
        System.out.println("Account Holder: "+a1.name+", Balance: "+a1.getBalance());
    }
}
