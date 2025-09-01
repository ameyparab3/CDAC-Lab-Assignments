import java.util.Scanner;
public class DaysOfTheWeek {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter day number: ");
        int num = sc.nextInt();
        if(num==1){
            System.out.println("Day in Monday");
        }
        else if(num==2){
            System.out.println("Day in Tuesday");
        }
        else if(num==3){
            System.out.println("Day in Wednesday");
        }
        else if(num==4){
            System.out.println("Day in Thursday");
        }
        else if(num==5){
            System.out.println("Day in Friday");
        }
        else if(num==6){
            System.out.println("Day in Saturday");
        }
        else if(num==7){
            System.out.println("Day in Sunday");
        }else{
            System.out.println("Incorrect number, try again");
        }
        sc.close();
    }
}
