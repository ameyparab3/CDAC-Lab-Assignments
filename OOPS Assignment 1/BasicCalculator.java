import java.util.Scanner;
public class BasicCalculator {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        String op = sc.nextLine();
        switch(op){
            case("+"):
            System.out.println("Result: "+(n1+n2));
            break;
            case("-"):
            System.out.println("Result: "+(n1-n2));
            break;
            case("*"):
            System.out.println("Result: "+(n1*n2));
            break;
            case("/"):
            System.out.println("Result: "+(n1/n2));
            break;
        }
        sc.close();
    }
}
