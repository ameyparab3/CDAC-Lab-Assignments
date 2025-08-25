public class PrintEvenNumbers {
    public void printEvenNumbers(int x){
        if(x%2==0){
            System.out.print(x+" ");
        }
    }
    public static void main(String argz[]){
        PrintEvenNumbers obj=new PrintEvenNumbers();
        int i=1;
        while(i<51){
            obj.printEvenNumbers(i);
            i++;
        }
    }
}
