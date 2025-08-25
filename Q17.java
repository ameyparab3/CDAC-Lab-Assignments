package Assignment4;

public class Q17 {
    public static void main(String argz[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=((2*i)-1);j++){
                if(i==1){
                    System.out.print("1");
                    break;
                }
                else if(j%2!=0){
                    System.out.print(j);
                }if(j==(2*i)-1){
                    break;
                }
                else if(j%2==0){
                        System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
