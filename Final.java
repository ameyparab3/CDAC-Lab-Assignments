package Assignment4;

class Final{
	public static void main(String argz[]){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hello";
        System.out.println("Hello");
        if(str1==str2 && str2==str3 && str3==str1){
            System.out.println("All point to same object");
        }
        else{
            System.out.println("They do not point to same object");
        }
    }
}