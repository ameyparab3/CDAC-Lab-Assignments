import java.util.Scanner;
public class PrintMultiplication {
    public void printMultiplicationTable(int x){
        for(int i=1;i<11;i++){
            System.out.println(x+" X "+i+" = "+(x*i));
        }
    }
    public static void main(String argz[]){
        PrintMultiplication obj = new PrintMultiplication();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        obj.printMultiplicationTable(y);
        sc.close();
    }
}
