class BankAccount{
	String AccountHolder;
	double balance;
	
	BankAccount(String AccountHolder, double balance){
		this.AccountHolder=AccountHolder;
		this.balance=balance;
	}
	
	void addBalance(double balance){
		this.balance=this.balance+balance;
	}
	
	void withdrawBalance(double balance){
		if(this.balance<balance){
			System.out.println("Insufficient Balance, ");
		}else{
			this.balance=this.balance-balance;
		}
	}
}

public class BankDepositeAndWithdrawal{
	public static void main(String argz[]){
		BankAccount b1 = new BankAccount("John", 1000.0);
		BankAccount b2 = new BankAccount("Rock", 2000.0);
		
		b1.addBalance(500);
		b2.addBalance(300);
		
		b1.withdrawBalance(1600);
		b2.withdrawBalance(200);
		
		System.out.println("Remaining balance of holder: "+b1.AccountHolder+", is: "+b1.balance);
		System.out.println("Remaining balance of holder: "+b2.AccountHolder+", is: "+b2.balance);
	}
}

