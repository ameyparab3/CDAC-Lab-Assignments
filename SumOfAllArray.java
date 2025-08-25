package Assignment4;
import java.util.Scanner;
public class SumOfAllArray {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.print("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.print("The sum of all numbers is: "+sum);
        sc.close();
    }
}