import java.util.Scanner;
public class TrafficSignal {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter traffic light colour: ");
        String str=sc.nextLine();
        String str2=str.toLowerCase();
        if(str2.equals("red")){
            System.out.println("Stop");
        }
        else if(str2.equals("green")){
            System.out.println("Go");
        }
        else if(str2.equals("yellow")){
            System.out.println("Ready");
        }
        sc.close();
    }
}
