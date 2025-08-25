package Assignment4;

public class Q27 {
    public static void main(String argz[]){
    String str1="hello";
    String str2="hello";
    String str3=new String("hello");
    String str4=new String("hello");
    if(str1==str2){
        System.out.println("Both variables point to the same object: true");
    }else{
        System.out.println("Both variables do not point to the same object: false");
    }
    if(str3==str4){
        System.out.println("Both variables point to the same object: true");
    }else{
        System.out.println("Both variables do not point to the same object: false");
    }
}
}
