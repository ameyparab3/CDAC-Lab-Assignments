import java.util.Scanner;
public class LuckyNumber {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 4 digit number: ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int[] arr = new int[str.length()];
        for (int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i)-'0';
        }
        int left = arr[0]+arr[1];
        int right = arr[2]+arr[3];
        if(left==right){
            System.out.println("Lucky number");
        }else{
            System.out.println("Not a lucky number");
        }
        sc.close();
    }
}
