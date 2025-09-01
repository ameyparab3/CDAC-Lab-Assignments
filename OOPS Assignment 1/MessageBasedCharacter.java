import java.util.Scanner;
public class MessageBasedCharacter {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = sc.next().charAt(0);
        char str2=Character.toUpperCase(str);
        switch(str2){
            case('A'):
            System.out.println("You selected option A");
            break;
            case('B'):
            System.out.println("You selected option B");
            break;
            case('C'):
            System.out.println("You selected option C");
            break;
            case('D'):
            System.out.println("You selected option D");
            break;
            case('E'):
            System.out.println("You selected option E");
            break;
        }
        sc.close();
    }
}
