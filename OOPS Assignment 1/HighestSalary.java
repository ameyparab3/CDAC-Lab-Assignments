public class HighestSalary {
    public static void main(String argz[]){
        int n1=45000;
        int n2=52000;
        int n3=50000;
        if(n1>n2){
            if(n1>n3){
                System.out.println("Company 1 offers the highest salary.");
            }
            else{
                System.out.println("Company 3 offers the highest salary.");
            }
        }
        else if(n2>n1){
            if(n2>n3){
                System.out.println("Company 2 offers the highest salary.");
            }
            else{
                System.out.println("Company 3 offers the highest salary.");
            }
        }
        else{
            System.out.println("Company 3 offers the highest salary.");
        }
    }
}
