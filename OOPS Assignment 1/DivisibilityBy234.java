import java.util.Scanner;
public class DivisibilityBy234 {
    public static void main(String argz[]){
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Divisible by 2");
        }
        if(num%3==0){
            System.out.println("Divisible by 3");
        }
        if(num%5==0){
            System.out.println("Divisible by 5");
        }
    }
}
