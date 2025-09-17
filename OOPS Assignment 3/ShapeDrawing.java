abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius=radius;
    }
    void draw(){
        System.out.println("Drawing a circle of radius "+this.radius);
    }
}

class Rectangle extends Shape{
    int length; int breadth;
    Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    void draw(){
        System.out.println("Drawing a Rectangle of length "+this.length+" and breadth "+this.breadth);
    }
}

class ShapeDrawing {
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        Rectangle r1 = new Rectangle(5, 10);
        c1.draw();
        r1.draw();
    }
}
