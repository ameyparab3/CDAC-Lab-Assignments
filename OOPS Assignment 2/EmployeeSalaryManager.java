class Employee{
    String name;
    double salary;
    int yearsOfService;
    static int totalEmployees;

    Employee(String name, double salary, int yearsOfService){
        this.name=name;
        this.salary=salary;
        this.yearsOfService=yearsOfService;
        totalEmployees++;
    }

    double calculateBonus(){
        double bonus=0;
        if(yearsOfService>5){
            bonus = salary*5/100;
        }else{
            bonus=0.0;
        } 
        return bonus;
    }

    static void showTotalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }
}

public class EmployeeSalaryManager {
    public static void main(String argz[]){
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 5);
        Employee e3 = new Employee("Suresh", 100000, 5);

        System.out.println("Employee "+e1.name+" Bonus: "+e1.calculateBonus());
        System.out.println("Employee "+e2.name+" Bonus: "+e2.calculateBonus());
        System.out.println("Employee "+e3.name+" Bonus: "+e3.calculateBonus());

        Employee.showTotalEmployees();
    }
}
