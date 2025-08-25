public class Greatestof3 {
    public static void main (String argz[]){
        int a = 7;
        int b = 6;
        int c = 5;
        if(a>b && a>c){
            System.out.println("a is largest");
        }
        else if(b>c && b>a){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }
    }
}
