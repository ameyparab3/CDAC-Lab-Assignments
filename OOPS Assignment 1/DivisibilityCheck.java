import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            if(num%3==0){
                if(num%5==0){
                    System.out.println("Divisible by 2");
                    System.out.println("Divisible by 3");
                    System.out.println("Divisible by 5");
                }
            }
        }
        else{
            System.out.println("Not divisible by any number");
        }
        sc.close();
    }
}
