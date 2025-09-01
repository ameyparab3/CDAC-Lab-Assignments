class Student{
    int rollNo, marks;
    String name;

    Student(String name, int rollNo, int marks){
        this.name=name;
        this.rollNo=rollNo;
        this.marks=marks;
    }

    void setMarks(int marks){
        this.marks=marks;
    }

    int getMarks(){
        return marks;
    }
}

public class StudentMarksChecker {
    public static void main(String argz[]){
        Student s1 = new Student("Stud1", 44, 56);
        s1.setMarks(66);
        System.out.println("Name: "+s1.name+", Roll Number: "+s1.rollNo+", Marks: "+s1.getMarks());
    }
}
