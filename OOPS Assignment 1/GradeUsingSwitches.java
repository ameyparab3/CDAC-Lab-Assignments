import java.util.Scanner;
public class GradeUsingSwitches {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int num=sc.nextInt();
        switch((int)num/10){
            case 0:
            System.out.println("Grade: F");
            break;
            case 1:
            System.out.println("Grade: F");
            break;
            case 2:
            if(num>24){
                System.out.println("Grade E");
            }else{
                System.out.println("Grade: F");
            }
            break;
            case 3:
            System.out.println("Grade: E");
            break;
            case 4:
            if(num>44){
                System.out.println("Grade: D");
            }else{
                System.out.println("Grade: E");
            }
            break;
            case 5:
            if(num>54){
                System.out.println("Grade: C");
            }else{
                System.out.println("Grade: D");
            }
            break;
            case 6:
            System.out.println("Grade: C");
            break;
            case 7:
            System.out.println("Grade: B");
            break;
            case 8:
            if(num>84){
                System.out.println("Grade: A");
            }else{
                System.out.println("Grade: B");
            }
            break;
            case 9:
            System.out.println("Grade: A");
            break;
            case 10:
            System.out.println("Grade: A");
            break;
        }
        sc.close();
    }
}
