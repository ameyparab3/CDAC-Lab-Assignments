package Assignment4;

public class Q23 {
    public static void main(String argz[]){
        int j=5;
        for(int i=1;i<7;i++){
            int space=j;
            while(space>0){
                System.out.print(" ");
                space--;
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            j--;
            System.out.println();
        }
        int l=1;
        for(int i=5;i>0;i--){
            int space2 = 1;
            while(space2<=l){
                System.out.print(" ");
                space2++;
            }
            for(int k=1;k<=((2*i)-1);k++){
                System.out.print("*");
            }
            l++;
            System.out.println();
        }
    }
}
