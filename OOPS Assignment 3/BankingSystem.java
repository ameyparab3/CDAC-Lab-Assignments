class BankAccount{
	private double balance; String name;
	double deposit;
	BankAccount(String name){
		this.name = name;
	}
	
	void setDeposite(double deposite){
		balance = balance+deposite;
	}
	
	void setWithdraw(double withdraw){
		if(withdraw<balance){
			balance = balance -  withdraw;
			System.out.println("Withdrawn amount: "+withdraw);
		}else{
			System.out.println("Withdraw amount greater than balance amount");
		}
	}
	
	void getBalance(){
		System.out.println("Balance is: "+balance);
	}
}

public class BankingSystem{
	public static void main(String argz[]){
		BankAccount b1 = new BankAccount("Ajay");
		b1.setDeposite(5000);
		b1.setWithdraw(2000);
		b1.getBalance();
	}
}