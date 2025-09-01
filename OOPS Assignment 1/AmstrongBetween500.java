public class AmstrongBetween500 {
    public static void main(String argz[]){
        for(int i=100; i<=500; i++){
            int j = i;
            int rem=1, cube=0; 
            while(j!=0){
                rem=j%10;
                cube=cube+(rem*rem*rem);
                j=j/10;
            }
            if(cube==i){
                System.out.println(i+" is an Armstrong number");
            }
        }
    }
}
