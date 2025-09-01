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

    String calculateGrade(){
        String grade="";
        if(marks>=80){
            grade="A";
        }else if(marks>=60){
            grade="B";
        }else if(marks>=40){
            grade="C";
        }else{
            grade="Fail";
        }
        return grade;
    }
}

public class StudentGradeCalculator {
    public static void main(String argz[]){
        Student s1 = new Student("Stud1", 44, 56);
        Student s2 = new Student("Stud2",46, 70);
        s1.setMarks(66);
        System.out.println("Name: "+s1.name+", Roll Number: "+s1.rollNo+", Marks: "+s1.getMarks()+", Grade? "+s1.calculateGrade());
        System.out.println("Name: "+s2.name+", Roll Number: "+s2.rollNo+", Marks: "+s2.getMarks()+", Grade? "+s2.calculateGrade());
    }
}
