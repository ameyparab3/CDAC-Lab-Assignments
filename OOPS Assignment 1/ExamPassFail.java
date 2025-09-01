import java.util.Scanner;
public class ExamPassFail {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter marks: ");
        int num = sc.nextInt();
        if(num>=35){
            System.out.println("Student has passed.");
        }else{
            System.out.println("Student has failed.");
        }
        sc.close();
    }
}
