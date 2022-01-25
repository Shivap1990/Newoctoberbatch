package collection;

import java.util.ArrayDeque;

public class arraydeque {

	public static void main(String[] args) {
		
		ArrayDeque q = new ArrayDeque();
		// allow duplicate & insertion order maintained
		q.add("fast");
		q.offer("slow");
		q.add("smart");
		q.offer("slow");
		q.offer("fast");
		q.offer(35.25f);
		System.out.println(q);
		
		// both method peek & element gives head element when arraydeque has elements
		// but when no elements in arraydeque element gives nosuchelement exception & peek gives null value
		//System.out.println(q.element());
		//System.out.println(q.peek());
		
		// both remove & poll method remove head element when elements present
		// but when no elements in arraydeque remove gives nosuchelement exception & poll gives null value
		System.out.println(q.remove());
		System.out.println(q.poll());
	}

}
