import java.util.Scanner;
public class BonusEligibilityTern {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary= sc.nextInt();
        System.out.print("Enter years of service: ");
        int years=sc.nextInt();
        if(years>5){
            System.out.println("Bonus: "+(salary*5/100));
        }else{
            System.out.println("Work more years for bonus");
        }
        sc.close();
    }
}
