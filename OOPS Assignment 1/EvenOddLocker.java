import java.util.Scanner;
public class EvenOddLocker {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter locker number: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Even locker number.");
        }
        else{
            System.out.println("Odd locker number.");
        }
        sc.close();
    }
}
