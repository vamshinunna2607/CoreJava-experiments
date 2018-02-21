package quadrilaterals;

public class Trapezoid extends Quadrilateral{
private double base1;
private double base2;
private double height;
private double side1;
private double side2;
public Trapezoid(double base1, double base2, double height, double side1, double side2) {
	
	this.base1 = base1;
	this.base2 = base2;
	this.height = height;
	this.side1 = side1;
	this.side2 = side2;
}
public Trapezoid() {
	
}

public void setHeight(double height) {
	this.height = height;
}

public void setSide1(double side1) {
	this.side1 = side1;
}
public double calculateArea()
{
	return (base1 +base2)*height/2;
}

public double calculatePerimeter()
{
	return side1+side2+base1+base2;
}

public String toString()
{
	return super.toString() + base1 +base2+height+side1+side2;
}





}
