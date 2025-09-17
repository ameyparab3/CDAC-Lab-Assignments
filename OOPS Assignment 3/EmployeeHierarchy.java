class Employee{
    String name; double basicSalary;
    //Have to use constructor to access private variables if added in super class. Then access using super() to call the parent constructor and set values in private variables
}

class RegularEmployee extends Employee{
    RegularEmployee(String name, double basicSalary){
        this.name = name;
        this.basicSalary=basicSalary*110/100;
    }
}

class ContractEmployee extends Employee{
    ContractEmployee(String name, double basicSalary){
        this.name = name;
        this.basicSalary=basicSalary*105/100;
    }
}

class EmployeeHierarchy {
    public static void main(String[] args) {
        RegularEmployee r1 = new RegularEmployee("Rahul", 20000);
        ContractEmployee c1 = new ContractEmployee("Riya", 15000);
        System.out.println(r1.name+" Net Salary = "+r1.basicSalary);
        System.out.println(c1.name+" Net Salary = "+c1.basicSalary);
    }
}
