package collection;

import java.util.Stack;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
		Vector list = new Vector();
	
		list.add(15);
		list.add('a');
		list.add("Super");
		list.add(28.78f);
		list.add(2567.99);
		list.add(false);
		System.out.println("Vector list is: "+list);
		
		Stack list1 = new Stack();
		// Stack--> LIFO---last in first out
		
      list1.add(25.77f);
      list1.add('a');
      list1.add("Stream");
      list1.add(287567);
      list1.add(17.98d);
      list1.add(true);
      list1.add(4);
      System.out.println("Stack is: "+list1);
      System.out.println(list1.get(2));
	}

}
