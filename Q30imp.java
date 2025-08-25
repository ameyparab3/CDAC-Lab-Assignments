package Assignment4;


public class Q30imp {
    public static void main(String argz[]){
        String str1 = new String ("hello");      //Both in SCP and Heap
        String str2 = str1.intern();
        System.out.println(str2);
        String str3 = "hello";                           //SCP only (taken from str1)           
        String str4 = "hello";
        System.out.println(str4);
        //if(str3==str2){
        //    System.out.println("str3 and str2 point to same? true");
        //}
        //else{
        //    System.out.println("str3 and str2 point to same? false");
        //}
        if(str3==str4){
            System.out.println("str3 and str4 point to same? True ");
            System.out.println(str3.hashCode());
            System.out.println(str4.hashCode());
        }
        else{
            System.out.println("str3 and str4 point to same? false");
            System.out.println(str3.hashCode());
            System.out.println(str4.hashCode());
            System.out.println(str3.hashCode());
            System.out.println( "Address"+ System.identityHashCode(str3));
             System.out.println(str4.hashCode());
             System.out.println("Address"+ System.identityHashCode(str4));
        }
        //System.out.println(str4.intern()==str3.intern());
    }
}
