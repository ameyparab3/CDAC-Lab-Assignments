import java.util.Scanner;
public class AgeCheck {
    public void checkAgeCategory(int x){
        if(x<18){
            System.out.println("You are a Minorrrrrrrrrrrrr");
        }
        else if(x>=18 && x<60){
            System.out.println("You are a adult");
        }
        else{
            System.out.println("You are a senior Citizen");
        }
    }
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        AgeCheck obj=new AgeCheck();
        obj.checkAgeCategory(age);
        sc.close();
    }
}
