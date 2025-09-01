import java.util.Scanner;
public class BasicCalculatorIfElse {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter operator: ");
        sc.nextLine();
        String op = sc.nextLine();
        if(op.equals("+")){
            System.out.println("Result: "+(n1+n2));
        }
        else if(op.equals("-")){
            System.out.println("Result: "+(n1-n2));
        }
        else if(op.equals("/")){
            System.out.println("Result: "+(n1/n2));
        }
        else if(op.equals("*")){
            System.out.println("Result: "+(n1*n2));
        }
        sc.close();
    }
}
