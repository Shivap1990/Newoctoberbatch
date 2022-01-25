package collection;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
	
		// FIFO--first in first out arrangement
		PriorityQueue q = new PriorityQueue();
		
	    /*q.add('z');
		q.add("Sun");
		q.add(20.25f);
		q.add(3597);
		System.out.println(q);*/

	    q.add('b');
		q.offer('d');
		q.add('c');
		q.add('a');
		System.out.println(q);
		
		//retrive head element--first element(element,peek method)
		//returns no such element exception
		//System.out.println(q.element());
		//returns null
		//System.out.println(q.peek());
		
		//remove head element-- remove ,poll
		
		// when no elements present remove gives no such element exception
		//System.out.println(q.remove());
		System.out.println(q);
		
		// when no elements present poll gives null value
		//System.out.println(q.poll());
		System.out.println(q);
		
		
	}

}
