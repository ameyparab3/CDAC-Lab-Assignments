abstract class Employee{
	String name; double salary;
	abstract void displaySalary();
}

class TeacherStaff extends Employee{
	String subject;
	TeacherStaff(String name, double salary, String subject){
		this.name=name;
		this.salary=salary;
		this.subject=subject;
	}
	
	void displaySalary(){
		System.out.println(this.name+" -> Subject="+this.subject+", salary="+this.salary);
	}
}

class Professor extends TeacherStaff{
	String specialization;
	Professor(String name, double salary, String subject, String specialization){
		super(name, salary, subject);              //Have to call super class constructor for variables only present in that super class
		this.specialization=specialization;
	}
	void displaySalary(){
		System.out.println(this.name+" -> Subject="+this.subject+", Specialization="+this.specialization+", salary="+this.salary);
	}
}

class Lecturer extends TeacherStaff{
	String department;
	Lecturer(String name, double salary, String subject, String department){
		super(name, salary, subject);				//Have to call super class constructor for variables only present in that super class
		this.department=department;
	}
	void displaySalary(){
		System.out.println(this.name+" -> Subject="+this.subject+", Department="+this.department+", salary="+this.salary);
	}
}
class CollegeStaffHierarchy{
    public static void main(String argz[]){
        Professor p1 = new Professor("Dr. Sharma", 80000, "Math", "Algebra");
        p1.displaySalary();
		
		Lecturer l1 = new Lecturer("Dr. Mehta", 50000, "Physics", "Science");
		l1.displaySalary();
    }
}