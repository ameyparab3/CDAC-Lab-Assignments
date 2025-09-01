import java.util.Scanner;
public class CharacterTypeChecker {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        char a = sc.next().charAt(0);
        if(a>='a' && a<='z' || a>='A' && a<='Z'){
            System.out.println("Alphabet");
        }
        else if(Character.isDigit(a)){
            System.out.println("Digit");
        }
        else if(Character.isDigit(a)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special");
        }
        sc.close();
    }
}
