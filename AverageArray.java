package Assignment4;
import java.util.Scanner;
public class AverageArray {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        float[] arr = new float[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.print("The average of the numbers is: "+sum/5);
        sc.close();
    }
}