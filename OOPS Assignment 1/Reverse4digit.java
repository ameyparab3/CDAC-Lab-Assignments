import java.util.Scanner;
class Reverse4digit{
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        int num = sc.nextInt();
        String length = Integer.toString(num);
        int len = length.length();
        String converted = Integer.toString(num);
        for(int i=len-1; i>=0;i--){
            System.out.print(converted.charAt(i));
        }
        sc.close();
    }
}