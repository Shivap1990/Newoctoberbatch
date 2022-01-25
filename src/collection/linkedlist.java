package collection;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// declare LinkedList
		LinkedList list = new LinkedList();
		
		//LinkedList<Integer> list1 = new LinkedList<Integer>();
		//LinkedList<String> list2 = new LinkedList<String>();
		//LinkedList<Character> list3 = new LinkedList<Character>();
		list.add(20);
		list.add(12.5);
		list.add('m');
		list.add("Kiran");
		list.add(23.75f);
		list.add('x');
		list.add(false);
		
		System.out.println("LinkedList is: " +list);
		
		list.addFirst(27.7);
		list.addLast("Hariom");
		
		System.out.println("LinkedList is: " +list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("LinkedList is: " +list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		//insertion,deletion operation--- use LinkedList
		//Retrival operation ---- use ArrayList
		
		
		
		
	

	}

}
