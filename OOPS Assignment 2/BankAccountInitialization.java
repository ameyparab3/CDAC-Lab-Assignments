class BankAccount{
    static double interestRate;
    static{
        interestRate = 4;
    }
    String name; double balance;

    BankAccount(String name, double balance){
        this.name=name;
        this.balance=balance;
    }
}
public class BankAccountInitialization {
    public static void main(String argz[]){
        BankAccount b1 = new BankAccount("Rohit",5000);
        BankAccount b2 = new BankAccount("Priya",15000);

        System.out.println("Bank Interest Rate Initialized: "+BankAccount.interestRate+"%");
        System.out.println("Account 1: Name="+b1.name+", Balance="+b1.balance);
        System.out.println("Account 2: Name="+b2.name+", Balance="+b2.balance);
    }
}
