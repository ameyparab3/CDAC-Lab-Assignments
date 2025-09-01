import java.util.Scanner;
public class SortThreeNumbersAscending {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1<n2 && n1< n3){
            if(n2<n3){
                System.out.println("Ascending order is: "+n1+" "+n2+" "+n3);
            }else{
                System.out.println("Ascending order is: "+n1+" "+n3+" "+n2);
            }
        }
        if(n2<n1 && n2<n3){
            if(n1<n3){
                System.out.println("Ascending order is: "+n2+" "+n1+" "+n3);
            }else{
                System.out.println("Ascending order is: "+n2+" "+n3+" "+n1);
            }
        }
        if(n3<n1 && n3<n2){
            if(n1<n2){
                System.out.println("Ascending order is: "+n3+" "+n1+" "+n2);
            }else{
                System.out.println("Ascending order is: "+n3+" "+n2+" "+n1);
            }
        }
    }
}
