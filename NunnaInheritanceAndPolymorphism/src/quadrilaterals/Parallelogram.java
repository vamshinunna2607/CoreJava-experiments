package quadrilaterals;

public class Parallelogram extends Quadrilateral{
	private double base;
	private double side;
	private double height;
	public Parallelogram(double base, double side, double height) {
		
		this.base = base;
		this.side = side;
		this.height = height;
	}
	public Parallelogram() {
		
	}
	public double calculateArea()
	{
		return base*height;
	}
	public double calculatePerimeter()
	{
		return 2*(base+side);
	}
	public String toString()
	{
		return super.toString()+ base +side+height;
	}
	
	

}
