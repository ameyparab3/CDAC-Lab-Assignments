package Assignment4;
import java.util.Scanner;
public class Factorial {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int digit=num;
        int fact=num;
        while(num>1){
            fact = fact*(num-1);
            num--;
        }
        System.out.println("Factorial of "+digit+" is "+fact);
        sc.close();
    }
}
