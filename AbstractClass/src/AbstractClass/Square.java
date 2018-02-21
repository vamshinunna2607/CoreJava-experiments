package AbstractClass;

public class Square extends Shape {
	
	private double side;
	

	public Square() {
		
	}

	public Square(double side) {
		
		this.side = side;
	}

	@Override
	double area() {
		return side*side;
	}

	@Override
	double perimeter() {
		return side+side+side+side;
	}
	
	public String toString()
	{
		return "Area and perimeter of square are "+area()+" and "+perimeter();
	}

}
