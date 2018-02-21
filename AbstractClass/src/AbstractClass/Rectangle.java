package AbstractClass;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	public Rectangle(double length, double breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}
	public Rectangle() {
		
	}
	@Override
	double area() {
		return length*breadth;
	}
	@Override
	double perimeter() {
		return 2*(length+breadth);
	}
	
	public String toString()
	{
		return "Area and perimeter of rectangle are "+area()+" and "+perimeter();
	}
	

}
