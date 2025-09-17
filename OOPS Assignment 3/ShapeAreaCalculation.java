// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ShapeArea{
    int calculateArea(int side){
        return side*side;
    }
    int calculateArea(int length, int breadth){
        return length*breadth;
    }
    double calculateArea(double radius){
        return 3.14*radius*radius;
    }
}

class Main {
    public static void main(String[] args) {
        ShapeArea s1 = new ShapeArea();
        System.out.println("Square Area = "+s1.calculateArea(5));
        ShapeArea s2 = new ShapeArea();
        System.out.println("Rectangle Area = "+s2.calculateArea(4, 6));
        ShapeArea s3 = new ShapeArea();
        System.out.printf("Circle Area = %.2f",s3.calculateArea(3.00));
    }
}