import java.util.Scanner;
public class Menu {
    static byte a = 100;
    static short b = 100;
    static int c = 100;
    static long d = 100;
    static float e = 100;
    static double f = 100;
    static char g = 100;
    static boolean h = true;
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        int temp=1;
        do{
            System.out.println("Enter a number between 1 and 4 to run a program or Choose 5 to exit...");
            System.out.print("Enter a number: ");
            int input = sc.nextInt();
            switch(input){
                case(1):
                    int Maths = 30;
                    int Science = 30;
                    int History = 30;
                    float avg = ((Maths + Science + History)/3);
                    if (avg>=90) {
                        System.out.println("Grade A");
                    }
                    else if(70<=avg && avg<=89){
                        System.out.println("Grade B");
                    }
                    else if(50<=avg && avg<=69){
                        System.out.println("Grade C");
                    }
                    else if(30<=avg && avg<=49){
                        System.out.println("Grade D");
                    }
                    else{
                        System.out.println("Fail");
                    }
                    break;
                //CASE 2/////////////////////////////////////////
                case(2):
                    int Year = 2024;
                    int Year1 = 1900;
                    if ((Year%4==0 && Year%100!=0)||(Year%400==0)){
                        System.out.println(Year +" is a leap year");
                    }
                    else{
                        System.out.println(Year+" is not a leap year");
                    }

                    if ((Year1%4==0 && Year1%100!=0)||(Year1%400==0)){
                        System.out.println(Year1+" is a leap year");
                    }
                    else{
                        System.out.println(Year1+" is not a leap year");
                    }
                    break;
                //CASE 3/////////////////////////////////////////
                case(3):
                    System.out.print("Enter a number between 1 and 7: ");
                    int num = sc.nextInt();
                    switch(num){
                        case 1:
                        System.out.println("The day is Sunday");
                        break;
                        case 2:
                        System.out.println("The day is Monday");
                        break;
                        case 3:
                        System.out.println("The day is Tuesday");
                        break;
                        case 4:
                        System.out.println("The day is Wednesday");
                        break;
                        case 5:
                        System.out.println("The day is Thursday");
                        break;
                        case 6:
                        System.out.println("The day is Friday");
                        break;
                        case 7:
                        System.out.println("The day is Saturday");
                        break;
                        default:
                        System.out.println("Invalid day number");
                        break;
                    }
                    break;
                case(4):
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    System.out.println(d);
                    System.out.println(e);
                    System.out.println(f);
                    System.out.println(g);
                    System.out.println(h);
                    break;
                case(5):
                    temp = 10;
                    break;
                default:
                    System.out.println("Invalid number. Try again.");
                    break;
            }
        }while(temp!=10);
        sc.close();
    }
}
