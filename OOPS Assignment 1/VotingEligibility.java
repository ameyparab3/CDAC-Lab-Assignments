import java.util.Scanner;
public class VotingEligibility {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
        sc.close();
    }
}
