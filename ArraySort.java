
import java.util.Scanner; import java.util.Arrays;
public class ArraySort {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 5 integers: ");
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}