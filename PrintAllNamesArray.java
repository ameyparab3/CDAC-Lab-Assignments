package Assignment4;
import java.util.Scanner;
public class PrintAllNamesArray {
    public static void main(String argz[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 4 names in a single line: ");
        String temp=sc.nextLine();                                             //Taking input as a single line
        String[] arr = temp.split(" ");                                  //Spliting the sentence between spaces and entering the words in the array
        for(int i=0;i<4;i++){
            System.out.println(arr[i]+" ");
        }
        sc.close();
    }
}


//Used .split as the input was in single line