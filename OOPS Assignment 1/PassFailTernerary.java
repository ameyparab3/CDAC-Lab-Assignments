import java.util.Scanner;
public class PassFailTernerary {
    public static void main(String argz[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter marks: ");
    int marks = sc.nextInt();
    if(marks>=35){
        System.out.println("Pass");
    }else{
        System.out.println("Fail");
    }
    sc.close();
}
}
