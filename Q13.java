import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q13{
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        Integer[] arr=new Integer[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> arr2=Arrays.asList(arr);
        System.out.print("Enter a number to seach: ");
        Integer match=sc.nextInt();
        for(Integer i:arr2){
            if(i==match){
                System.out.println("FOund");
            }
        }
        //if(Arrays.asList(arr).contains(match)){
            //System.out.println("Found");
        //}
        
    }
}