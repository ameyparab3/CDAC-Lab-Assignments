package Assignment4;
import java.util.Scanner;
public class Q26imp {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        char[] arr = str.toCharArray();                                //Converting a string to a char array
        int last=(str.length())-1;
        //System.out.println(arr);
        char[] rev= new char[last+1];
        int count=0;
        int wrong=1;
        for(int i=last;i>=0;i--){
            rev[count]=arr[i];
            count++;
        }
        count = 0;
        for(int i=last;i>=0;i--){
            if(rev[i]==arr[i]){
                //System.out.println(last);
                //System.out.println(rev[i]);
                //System.out.println(arr[i]);
                wrong=0;
            }else{
                wrong=1;
            }
        }
        if(wrong==1){
            System.out.print("The string '"+str+"' is not a palindrome");
        }
        else{
            System.out.print("The string '"+str+"' is a palindrome");
        }
        sc.close();
    }
}