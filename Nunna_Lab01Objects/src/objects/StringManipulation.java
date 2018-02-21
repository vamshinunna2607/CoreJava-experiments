package objects;
import java.util.*;

public class StringManipulation {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string1 = "        First" ;
		String string2 = " Lab ";
		String string3 = "Computer";
		String string4 =" Program     ";
		String string = "fnunfunisfufunnufn";
		double myValue =48.50;
		double myValue1 = 90;
		double myValue2 = 20;
		int myNumber1  =3;
		int myNumber2  = 5;
		
		String string5 = string1.concat(string2).concat(string3).concat(string4);
		//System.out.println(string5);
		System.out.println(string5.length());
		String string6= string5.trim();
		System.out.println(string6);
		System.out.println(string6.length());
		System.out.println(string6.substring(string6.indexOf("Program")));
		System.out.println((string6.substring(string6.indexOf("Program")).indexOf("r")));
		System.out.println(string.indexOf("fun"));
		System.out.println(string.substring(string.indexOf("fun"), string.indexOf("fun")+3));
		System.out.println(string.indexOf("is"));
		System.out.println(string.substring(string.indexOf("is"),string.indexOf("is")+2));
		System.out.println(Math.sqrt(myValue));
		System.out.println(Math.ceil(Math.sqrt(myValue)));
		System.out.println(Math.floor(Math.sqrt(myValue)));
		System.out.println(Math.round(Math.sin(myValue1))+" "+Math.round(Math.tan(myValue1)));
		System.out.println(Math.round(Math.sin(myValue2))+" "+Math.round(Math.tan(myValue2)));
		System.out.println(Math.pow(myNumber1, myNumber2));
		
		
		Random rnd = new Random();
		 rnd.setSeed(20L);
		 rnd.ints(0, 100);
		 System.out.println(rnd.ints(5));
		 
		
	}

}
