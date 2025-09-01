import java.util.Scanner;
public class SquareRectangleGarden {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter length: ");
        int len=sc.nextInt();
        System.out.printf("Enter breadth: ");
        int bread=sc.nextInt();
        if(len==bread){
            System.out.println("Square garden.");
        }
        else{
            System.out.println("Rectangular garden.");
        }
        sc.close();
    }
}
