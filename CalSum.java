import java.util.Scanner;
public class CalSum {
    int result = 0;
    public void sumation(int x){
        for(int i=1;i<=x;i++){
            result = result+i; 
        }
        System.out.println("The sum of numbers from 1 to "+x+" is: "+result);
    }
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        CalSum obj=new CalSum();
        obj.sumation(y);
        sc.close();
    }
}
