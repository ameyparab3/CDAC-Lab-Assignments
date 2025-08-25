package Assignment4;

public class Q15 {
    public static void main(String argz[]){
        int i=0;
        for(i=1;i<=5;i++){
            System.out.print(i);
            if(i>0){
                for(int j=(i-1);j>0;j--){
                    System.out.print("*"+i);
                }
            }
            System.out.println();
        }
        int k=5;
        for(k=5;k>=1;k--){
            System.out.print(k);
            if(k>0){
                for(int j=(k-1);j>0;j--){
                    System.out.print("*"+k);
                }
            }
            System.out.println();
        }
    }
}
