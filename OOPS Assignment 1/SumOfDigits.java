import java.util.Scanner;
public class SumOfDigits {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem=0, sum=0;
        while(num!=0){
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("Sum of digits: "+sum);
        sc.close();
    }
}
