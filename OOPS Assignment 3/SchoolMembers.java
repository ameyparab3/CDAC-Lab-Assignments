abstract class Member{
	String name; int id;
	abstract void displayInfo();
}

class Teacher extends Member{
	String subject;
	Teacher(String name, int id, String subject){
		this.name=name;
		this.id=id;
		this.subject=subject;
	}
	@Override
	void displayInfo(){
		System.out.println(this.name+" -> ID="+this.id+", Subject="+this.subject);
	}
}

class Student extends Member{
	int grade;
	Student(String name, int id, int grade){
		this.name=name;
		this.id=id;
		this.grade=grade;
	}
	@Override
	void displayInfo(){
		System.out.println(this.name+" -> ID="+this.id+", Grade="+this.grade);
	}
}

class Staff extends Member{
	String department;
	Staff(String name, int id, String department){
		this.name=name;
		this.id=id;
		this.department=department;
	}
	@Override
	void displayInfo(){
		System.out.println(this.name+" -> ID="+this.id+", Subject="+this.department);
	}
}

class SchoolMembers{
    public static void main(String[] argz){
         Teacher t1 = new Teacher("Mr. Kumar", 101, "English");
         t1.displayInfo();
         Student s1 = new Student("Riya", 201, 10);
         s1.displayInfo();
         Staff st1 = new Staff("Mr. Das", 301, "Maintenance");
         st1.displayInfo();
    }
}   
