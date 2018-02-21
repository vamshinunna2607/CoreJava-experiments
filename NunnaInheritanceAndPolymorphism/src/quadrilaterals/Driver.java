package quadrilaterals;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		

			
			
				Trapezoid t = new Trapezoid(19.5, 21.24, 8.9, 4.8, 4.9);
				Trapezoid rt = new RightTrapezoid(19.5, 21.24, 4.8, 4.9);
				Parallelogram p = new Parallelogram(15.25, 10.75, 2.5);
				Rhombus r = new Rhombus(6.5, 6.7);
				Rhombus s = new Square(6.5);
				System.out.println(t.calculatePerimeter());
				System.out.println(t.calculateArea());
				System.out.println(p.calculatePerimeter());
				System.out.println(p.calculateArea());
				System.out.println(r.calculatePerimeter());
				System.out.println(r.calculateArea());
				System.out.println(s.calculatePerimeter());
				System.out.println(s.calculateArea());
				System.out.println(rt.calculateArea());
				System.out.println(rt.calculatePerimeter());
				

}
}