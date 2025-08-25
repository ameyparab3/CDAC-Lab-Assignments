package Assignment4;
import java.util.Scanner;
public class Even1toN {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            if(i%2==0){
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
