class BankNameDisplay1{
	static String bankName;
	String name; int balance;
	static void displayBankName(String bankName){
		System.out.println("Bank name is: "+bankName);
	}
	static{
	  System.out.println("This is a static block");
	}
	
	BankNameDisplay1(String name, int balance){
		this.name=name;
		this.balance=balance;
	}
}

public class BankNameDisplay{
	public static void main(String argz[]){
		BankNameDisplay1 b1 = new BankNameDisplay1("Hello",5000);
		BankNameDisplay1.displayBankName("ABC Bank");
	}
}
