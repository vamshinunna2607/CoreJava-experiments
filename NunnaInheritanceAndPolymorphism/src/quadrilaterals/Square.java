package quadrilaterals;

public class Square extends Rhombus {

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(double diagonal1) {
		super(diagonal1, diagonal1);
		// TODO Auto-generated constructor stub
	}

	public void setDiagonal1(double diagonal1)
	{
		super.setDiagonal1(diagonal1);
		super.setDiagonal1(diagonal1);
	}
	
	public String toString()
	{
		return super.toString();
	}
	

	
}
