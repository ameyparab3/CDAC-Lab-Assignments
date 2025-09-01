import java.util.Scanner;
class PositiveNegativeZero{
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Number is Positive");
        }else if(num==0){
            System.out.println("Number is Zero");
        }else{
            System.out.println("Number is Negative");
        }
    }
}