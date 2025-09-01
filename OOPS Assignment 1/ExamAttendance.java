import java.util.Scanner;
public class ExamAttendance {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter total classes held: ");
        int total=sc.nextInt();
        System.out.printf("Enter classes attended: ");
        int attend=sc.nextInt();
        if(attend>=(total*75/100)){
            System.out.println("Student is allowed to sit for the exam.");
        }else{
            System.out.println("Student is not allowed to sit for the exam.");
        }
        sc.close();
    }
}
