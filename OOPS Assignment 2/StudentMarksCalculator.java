class Student{
    String name;
    int marks;
    static int totalStudents;
    boolean isPassed;

    Student(String name, int marks){
        this.name=name;
        this.marks=marks;
        totalStudents++;
        if(marks>=35){
            this.isPassed=true;
        }
    }

    boolean isPassed(){
            return isPassed;
    }

    static int showTotalStudents(){
        return totalStudents;
    }
}

public class StudentMarksCalculator {
    public static void main(String argz[]){
        Student s1 = new Student("Rahul", 78);
        Student s2 = new Student("Rahul", 34);
        Student s3 = new Student("Rahul", 65);

        System.out.println("Student "+s1.name+" Passed? "+s1.isPassed());
        System.out.println("Student "+s2.name+" Passed? "+s2.isPassed());
        System.out.println("Student "+s3.name+" Passed? "+s3.isPassed());

        System.out.println("Total students: "+Student.showTotalStudents());
    }
}
