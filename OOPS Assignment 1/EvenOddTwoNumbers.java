import java.util.Scanner;
public class EvenOddTwoNumbers {
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first numeber: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2=sc.nextInt();
        int even=0, odd=0;        
        if(n1%2==0){
            even++;
        }
        if(n2%2==0){
            odd++;
        }
        if(even>0 && odd>0){
            System.out.println("Numbers are even");
        }
        else if(even>0 && odd==0 || even==0 && odd>0){
            System.out.println("Numbers are mixed");
        }
        else if(even==0 && odd==0){
            System.out.println("Numbers are odd");
        }
    }
}
