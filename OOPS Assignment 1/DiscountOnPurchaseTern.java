import java.util.Scanner;
public class DiscountOnPurchaseTern {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        int num=sc.nextInt();
        if(num>1000){
            System.out.println("Total cost after discount: "+(num-(num*10/100)));
        }else{
            System.out.println("No discount");
        }
    }
}
