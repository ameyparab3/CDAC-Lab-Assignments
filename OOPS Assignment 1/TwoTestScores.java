import java.util.Scanner;
class TwoTestScores{
    public static void main(String argz[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        if(n1>n2){
            System.out.println("Test 1 has higher score.");
        }
        else if(n2>n1){
            System.out.println("Test 2 has higher score.");
        }
        sc.close();
    }
}