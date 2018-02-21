package quadrilaterals;

public class RightTrapezoid extends Trapezoid {
	public RightTrapezoid()
	{
		super();
	}
	public RightTrapezoid(double base1, double base2, double side1, double side2)
	{
		super(base1,base2,side1,side1,side2);
		
	}

	public void setSide1( double side1)
	{
		super.setSide1(side1);
		super.setHeight(side1);
	}
	public String toString()
	{
		return super.toString();
	}
}
