package Assignment4;
import java.util.Scanner;
public class Odd1toN {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=num){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        System.out.print("The sum of odd numbers from 1 to "+num+" is: "+sum);
        sc.close();
    }
}