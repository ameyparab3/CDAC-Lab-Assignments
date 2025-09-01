import java.util.Scanner;
public class Armstrong {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int fin = num;
        int rem=1, sum=0, cube=0; 
        while(num!=0){
            rem=num%10;
            cube=cube+(rem*rem*rem);
            num=num/10;
            System.out.println(num);
            System.out.println(rem);
        }
        if(cube==fin){
            System.out.println(fin+" is an Armstrong number");
        }else{
            System.out.println(fin+" Not an Armstrong number");
        }
        sc.close();
    }
}
