import java.util.Scanner;
public class ExamEligibility {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Classes held: ");
        int held = sc.nextInt();
        System.out.printf("Class attended: ");
        int attend = sc.nextInt();
        sc.nextLine();
        System.out.println("Medical cause (Y/N): ");
        String cause = sc.nextLine();
        float percent = ((float)attend/held)*100;
        if(cause.equalsIgnoreCase("Y")){
            System.out.println("Student is allowed to sit for the exam");
        }
        else if(cause.equalsIgnoreCase("N") && percent<85){
            System.out.println("Student is not allowed to sit for the exam");
        }
        else if(cause.equalsIgnoreCase("N") && percent>=85){
            System.out.println("Student is allowed to sit for the exam");
        }
        sc.close();
    }
}
