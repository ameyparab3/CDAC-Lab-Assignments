import java.util.Scanner;
public class Transaction {
   public static void main(String argz[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter amount:");
    int inp=sc.nextInt();
    if(inp>0){
        System.out.println("Deposit transaction.");
    }
    else if(inp<0){
        System.out.println("Withdrawal transaction.");
    }
        sc.close();
   }
}
