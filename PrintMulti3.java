package Assignment4;
import java.util.Scanner;
public class PrintMulti3 {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i=1; i<=num;i++){
            if(i%3==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}
