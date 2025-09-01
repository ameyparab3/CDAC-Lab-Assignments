import java.util.Scanner;
public class DayType {
    public static void main(String argz[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter day type (1-Workday, 2-Weekend): ");
    int num = sc.nextInt();
    if(num==1){
        System.out.println("It's workday. Work today.");
    }else if(num==2){
        System.out.println("It's weekend. No work today.");
    }
        sc.close();
}
}
