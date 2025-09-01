import java.util.Scanner;
public class EvenOrOddTernerary {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is Even");
        }
        sc.close();
    }
}
