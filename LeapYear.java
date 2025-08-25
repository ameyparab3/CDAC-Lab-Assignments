public class LeapYear {
    public static void main(String argz[]){
        int Year = 2024;
        int Year1 = 1900;
        if ((Year%4==0 && Year%100!=0)||(Year%400==0)){
            System.out.println(Year +" is a leap year");
        }
        else{
            System.out.println(Year+" is not a leap year");
        }

        if ((Year1%4==0 && Year1%100!=0)||(Year1%400==0)){
            System.out.println(Year1+" is a leap year");
        }
        else{
            System.out.println(Year1+" is not a leap year");
        }
    }
}
