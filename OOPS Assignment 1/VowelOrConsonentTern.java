import java.util.Scanner;
public class VowelOrConsonentTern {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character: ");
        char c = sc.next().charAt(0);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("Vowel");
        }else{
            if(c>='a' && c<='z' || c>='A' && c<='Z'){
                System.out.println("Consonant");
            }else{
                System.out.println("Not an alphabet");
            }
        }
        sc.close();
    }
}
