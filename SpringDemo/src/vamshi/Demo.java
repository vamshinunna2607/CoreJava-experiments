package vamshi;
import java.util.*;
public class Demo {
	public long fact(int n)
	{
		if (n<1)
			return 1;
		else return n*fact(n-1);
	}

	public static void main(String[] args) {
//		String name;
//		int age;
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter your name:");
//		
//		name =s.nextLine();
//		System.out.println(name);
//		System.out.println("enter your age");
//		
//		age = s.nextInt();
//		System.out.println(age);
//        s.close();
		Demo d = new Demo();
		System.out.println(d.fact(100));
		
	}

}
