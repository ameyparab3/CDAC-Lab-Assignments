abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateSalary();
}

interface BonusEligible {
    double calculateBonus();
}
class PermanentEmployee extends Employee implements BonusEligible {
    double basicSalary;
    double hra;

    PermanentEmployee(String name, int id, double basicSalary, double hra) {
        super(name, id);
        this.basicSalary = basicSalary;
        this.hra = hra;
    }

    @Override
    double calculateSalary() {
        return basicSalary + hra;
    }

    @Override
    public double calculateBonus() {
        return 0.10 * basicSalary + 0.01 * hra;
    }
}

class ContractEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        PermanentEmployee e1 = new PermanentEmployee("Amit", 1, 50000, 5000);
        PermanentEmployee e2 = new PermanentEmployee("Sara", 2, 60000, 4000);
        ContractEmployee c1 = new ContractEmployee("Neha", 3, 300, 100);
        ContractEmployee c2 = new ContractEmployee("Ravi", 4, 400, 80);
        printEmployeeDetails(e1);
        printEmployeeDetails(e2);
        printEmployeeDetails(c1);
        printEmployeeDetails(c2);
    }

    static void printEmployeeDetails(Employee e) {
        System.out.print(e.name + " Salary = " + (int) e.calculateSalary());
        if (e instanceof BonusEligible) {
            double bonus = ((BonusEligible) e).calculateBonus();
            System.out.println(", Bonus = " + (int) bonus);
        } else {
            System.out.println();
        }
    }
}
