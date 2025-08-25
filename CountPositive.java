package Assignment4;
import java.util.Scanner;
public class CountPositive {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 6 integers: ");
        int[] arr = new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        int positive=0; int negative=0; int i=0;
        while(i<6){
            if(arr[i]>0){
                positive++;
            }
            else if(arr[i]<0){
                negative++;
            }
            i++;
        }
        System.out.println("Positive numbers: "+positive);
        System.out.println("Negative numbers: "+negative);
        sc.close();
    }
}