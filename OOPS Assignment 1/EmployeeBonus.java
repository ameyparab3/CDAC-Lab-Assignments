import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter salary: ");
        int sal=sc.nextInt();
        System.out.printf("Enter years of service: ");
        int year=sc.nextInt();
        if(year>5){
            int bonus=sal*5/100;
            System.out.println("Bonus amount: "+bonus);
        }else{
            System.out.println("No bonus amount.");
        }
        sc.close();
    }
}
