package quadrilaterals;

public class Rhombus extends Parallelogram{

	private double diagonal1;
	private double diagonal2;
	
	public Rhombus( double diagonal1, double diagonal2) 
	{
		
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	public Rhombus()
	{
		
	}
	
	
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}
	
	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	public double calculateArea()
	{
		return diagonal1*diagonal2*0.5;
	}
	public double calculatePerimeter()
	{
		return 2*Math.sqrt(diagonal1*diagonal1 +diagonal2*diagonal2);
	}
	public String toString()
	{
		return diagonal1+" ,"+diagonal2+ calculateArea()+calculatePerimeter();
	}
	
}
