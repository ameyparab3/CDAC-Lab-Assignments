package Assignment4;

import java.util.Scanner;
public class Print1toN {
    public static void main(String argz[]){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(i<=num){
            System.out.print(i+" ");
            i++;
        }
        sc.close();;
    }
}
