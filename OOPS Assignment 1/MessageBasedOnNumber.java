import java.util.Scanner;
public class MessageBasedOnNumber {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        switch(num){
            case (1):
            System.out.println("You selected option 1");
            break;
            case (2):
            System.out.println("You selected option 2");
            break;
            case (3):
            System.out.println("You selected option 3");
            break;
            case (4):
            System.out.println("You selected option 4");
            break;
            case (5):
            System.out.println("You selected option 5");
            break;
        }
        sc.close();
    }
}
