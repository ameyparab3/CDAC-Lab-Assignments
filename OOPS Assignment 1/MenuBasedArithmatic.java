import java.util.Scanner;
public class MenuBasedArithmatic {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Select operation (1-Addition, 2-Subtraction): ");
        String str = sc.nextLine();
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        if(str.equals("+")){
            System.out.println("Result: "+(num1+num2));
        }else if(str.equals("-")){
            System.out.println("Result: "+(num1-num2));
        }
        sc.close();
    }
}
