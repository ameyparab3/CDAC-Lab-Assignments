package Assignment4;
import java.util.Scanner;
public class SearchArray {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int num=sc.nextInt(); int tag=0;
        for(int i = 0; i<5; i++){
            if(arr[i]==num){
                System.out.println("Found");
                tag=1; break;
            }
        }
        if(tag==0){
            System.out.println("Not Found");
        }
        sc.close();
    }
}