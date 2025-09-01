import java.util.Scanner;
public class ReverseAndPalindrome {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int num = sc.nextInt();
        String str = Integer.toString(num);
        char[] arr = new char[str.length()];
        int counter=0;
        for(int i = ((str.length())-1); i>=0;i--){
                arr[counter]=str.charAt(i);
                counter++;
        }
        String rev = new String (arr);
        int reverse=Integer.parseInt(rev);
        if(reverse==num){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not palindrome");
        }
    }
}
