import java.util.Scanner;
public class ShopDiscount {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter total purchase amount: ");
        int amount=sc.nextInt();
        if(amount>1000){
            amount=amount-(amount*10/100);
            System.out.println("Final cost after discount: "+amount);
        }else{
            System.out.println("Final cost without discount: "+amount);
        }
        sc.close();
    }
}
