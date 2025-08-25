package Assignment4;
import java.util.Scanner;
public class LargestArray {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.print("The largest element is: "+largest);
        sc.close();
    }
}