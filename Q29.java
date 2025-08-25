package Assignment4;
import java.util.Scanner;
public class Q29 {
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two strings: ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=str1+str2;
        boolean fax = (str3==str1);
        System.out.println("Is the str3 pointing to the same object as str1?"+fax);
        boolean fax1 = (str3==str2);
        System.out.println("Is the str3 pointing to the same object as str2?"+fax1);
        sc.close();
    }
}
