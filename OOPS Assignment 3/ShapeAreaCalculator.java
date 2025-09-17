interface Shape{
	void calculateArea();
}

class Circle implements Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public void calculateArea(){
		System.out.println("Circle Area = "+(3.14*this.radius*this.radius));
	}
}
class Rectangle implements Shape{
	double length, breadth;
	Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void calculateArea(){
		System.out.println("Rectangle Area = "+(this.length*this.breadth));
	}
}
class Square implements Shape{
	double side;
	Square(double side){
		this.side=side;
	}
	public void calculateArea(){
		System.out.println("Square Area = "+(this.side*this.side));
	}
}

class ShapeAreaCalculator{
	public static void main(String argz[]){
		Circle c1 = new Circle(5);
		c1.calculateArea();
		Rectangle r1 = new Rectangle(10, 5);
		r1.calculateArea();
		Square s1 = new Square(4);
		s1.calculateArea();
	}
}