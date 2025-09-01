class Employee{
	int id; String name; double basicSalary;
	static int idCounter=1000;
	
	Employee(){
		this.name="Unknown";
		this.basicSalary=20000;
	}
	Employee(String name, double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
		idCounter++;
		this.id=idCounter;
	}
	
	int getId(){
		return id;
	}
	String getName(){
		return name;
	}double getSalary(){
		return basicSalary;
	}
}
public class EmployeeAutoIdGenerator{
	public static void main(String argz[]){
		Employee e1 = new Employee("Kaivalya", 1000.0);
		Employee e2 = new Employee("Raju",1500.5);
		Employee e3 = new Employee();
		
		System.out.println("Employee Name: "+e1.getName()+", id: "+e1.getId()+", Salary: "+e1.getSalary());
		System.out.println("Employee Name: "+e2.getName()+", id: "+e2.getId()+", Salary: "+e2.getSalary());
		System.out.println("Employee Name: "+e3.getName()+", id: "+e3.getId()+", Salary: "+e3.getSalary());
		
	}
}
