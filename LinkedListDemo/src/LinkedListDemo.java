import java.util.*;
public class LinkedListDemo {

	
	//LinkedList<Integer> myList = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(3);
		l.addFirst(2);
		l.addLast(6);
		l.addLast(8);
		l.addFirst(15);
		l.add(3, 17);
		l.add(5, 25);
		l.add(l.indexOf(2) + 1, 34);
		l.set(4, 100);
		
		ListIterator<Integer> newList = l.listIterator();
		
		//System.out.println(newList.);

		while(newList.hasNext())
		{
			System.out.print(newList.next()+",");
			
			
		}

		
		

	}

}
