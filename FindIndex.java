package Assignment4;
import java.util.Scanner;
public class FindIndex {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter a number to search: ");
        int search=sc.nextInt();
        int i=0; int tag=0;
        while(i<5){
            if(arr[i]==search){
                System.out.print("The number "+search+" is found at index "+i);
                tag++;
            }
            i++; 
        }
        if(tag==0){
            System.out.print("Not found");
        }
        sc.close();
    }
}