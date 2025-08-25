import java.util.Scanner;
class inputPositive {
	public void askForPositiveNumber(){
		int num=0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter a positive number: ");
			num=sc.nextInt();
			if(num>0){
				System.out.println("You entered a positive number: "+num);
			}
		} while(num<=0);
	}
	public static void main(String argz[]){
		inputPositive b = new inputPositive();
		b.askForPositiveNumber();
	}
}	
