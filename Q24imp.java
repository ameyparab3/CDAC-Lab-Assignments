package Assignment4;
import java.util.Scanner;
public class Q24imp {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.println(arr[4]);
        System.out.println(arr[0]);
        int last=(str.length())-1;
        System.out.println(last);
        System.out.println(arr);
        char[] rev= new char[last+1];
        int count=0;
        for(int i=last;i>=0;i--){
            rev[count]=arr[i];
            count++;
        }
        String rev2 = new String(rev);                       //Converting a char array to string
        System.out.print("Reversed string is: "+rev2);
        sc.close();
    }
}
