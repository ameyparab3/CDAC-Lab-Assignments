class Student{
    String name, className;
    static int tuitionFees;
    int tuitionFees1;
    static{
        tuitionFees=30000;
    }

    Student(String name, String className){
        this.name=name;
        this.className=className;
        this.tuitionFees1=tuitionFees;
    }
}

public class SchoolFeeSystem {
    public static void main(String argz[]){
        Student s1 = new Student("Anjali", "10th");
        Student s2 = new Student("Vikram", "12th");

        System.out.println("School Tuition Fee Initialized : "+Student.tuitionFees);
        System.out.println("Student 1: Name="+s1.name+", Class="+s1.className+", Tuition Fee: "+s1.tuitionFees1);
        System.out.println("Student 2: Name="+s2.name+", Class="+s2.className+", Tuition Fee: "+s2.tuitionFees1);
    }
}
