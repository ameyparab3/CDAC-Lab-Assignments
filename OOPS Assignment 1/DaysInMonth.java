import java.util.Scanner;
public class DaysInMonth {
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12: ");
        int num = sc.nextInt();
        if(num%2!=0){
           System.out.println("31 days");
        }
        if(num%2==0){
            if(num==2){
                System.out.println("28 or 29 days");
            }
            else if(num==8){
                System.out.println("31 days");
            }
            else{
                System.out.println("30 days");
            }
        }
        sc.close();
    }
}
