class Employee{
    private int age;
    void setAge(int age){
        if(age>=18){
            this.age=age;
        }else{
            System.out.println("You are too young.");
        }
    }
    void getAge(){
        if(this.age>=18){
            System.out.println("age = "+this.age);
        }
    }
}

class EmployeeAgeValidation {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e2.setAge(18);
        e1.setAge(17);
        e1.getAge();
        e2.getAge();
    }
}
