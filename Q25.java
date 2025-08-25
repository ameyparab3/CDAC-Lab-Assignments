package Assignment4;
import java.util.Scanner;
public class Q25 {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int last = (input.length())-1;
        int vowels = 0;
        for(int i=0;i<=last;i++){
            if(input.charAt(i)=='a'){
                vowels++;
            }
            else if(input.charAt(i)=='a'){
                vowels++;
            }
            else if(input.charAt(i)=='e'){
                vowels++;
            }
            else if(input.charAt(i)=='i'){
                vowels++;
            }
            else if(input.charAt(i)=='o'){
                vowels++;
            }
            else if(input.charAt(i)=='u'){
                vowels++;
            }
        }
        System.out.print("The number of vowels in "+"'"+input+"'"+" is: "+vowels );
        sc.close();
    }
    
}
