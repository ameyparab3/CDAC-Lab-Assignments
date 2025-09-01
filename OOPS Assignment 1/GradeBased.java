import java.util.Scanner;
public class GradeBased {
    public static void main (String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter percentage marks: ");
        int marks=sc.nextInt();
        if(marks>=90){
            System.out.println("Grade: A+");
        }
        if(marks>75 && marks<90){
            System.out.println("Grade: A");
        }
        if(marks>65 && marks<76){
            System.out.println("Grade: B+");
        }
        if(marks>50 && marks<66){
            System.out.println("Grade: B");
        }
        if(marks>34 && marks<51){
            System.out.println("Grade: C");
        }
        if(marks<35){
            System.out.println("Failed.");
        }
        sc.close();
    }
}
