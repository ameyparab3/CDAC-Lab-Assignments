import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char b = sc.nextLine().charAt(0);
        char a = Character.toLowerCase(b);
        if (a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonent");
        }
        sc.close();
    }
}
