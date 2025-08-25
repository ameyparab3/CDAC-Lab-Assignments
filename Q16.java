package Assignment4;

public class Q16 {
    public static void main(String argz[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j!=1){
                    System.out.print("*");
                }
                System.out.print(j);
            }
            System.out.println();
        }
    }
}