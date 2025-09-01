import java.util.Scanner;
public class SeasonBasedOnMonth {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter month number: ");
        int num=sc.nextInt();
        if(num>2 && num<6){
            System.out.println("Season is Summer");
        }
        else if(num>5 && num<9){
            System.out.println("Season is Monsoon");
        }
        else if(num>8 && num<12){
            System.out.println("Season is Autumn");
        }
        else if(num>0 && num<3){
            System.out.println("Season is Winter");
        }
        else if(num==12){
            System.out.println("Season is Winter");
        }
        sc.close();
    }
}
