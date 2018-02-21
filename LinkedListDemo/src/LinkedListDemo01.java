import java.util.*;

public class LinkedListDemo01 {

	private static LinkedList<Integer> myList = new LinkedList<Integer>();
	
	
	private static void printList()
	{
       ListIterator<Integer> newList = myList.listIterator();
		
		while(newList.hasNext())
		{
			System.out.print(newList.next()+" ");
			
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		
		myList.add(3);
		myList.addFirst(2);
		myList.addLast(6);
		myList.addLast(8);
		myList.addFirst(15);
		myList.add(3, 17);
		myList.add(5, 25);
		myList.add(myList.indexOf(2) + 1, 34);
		LinkedListDemo01.printList();
		myList.set(4, 100);
		System.out.println(myList.contains(34));
		System.out.println(myList.contains(27));
		System.out.println(myList.size());
		myList.removeFirst();
		LinkedListDemo01.printList();
		
	}
}
