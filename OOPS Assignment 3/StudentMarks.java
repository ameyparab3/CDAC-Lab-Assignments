class Student{
	private int marks;
	
	void setMarks(int marks){
		if(marks>0 && marks<101){
			this.marks=marks;
		}else{
			System.out.println("Invalid marks");
		}
	}
	
	void getMarks(){
		System.out.println("Marks: "+marks);
	}
}
	
public class StudentMarks{
	public static void main(String argz[]){
		Student s1 = new Student();
		s1.setMarks(177);
		s1.getMarks();
	}
}
