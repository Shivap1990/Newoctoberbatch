package collection;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
	
		// insertion order is maintained & duplicate not allowed 
		LinkedHashSet ls = new LinkedHashSet();
		
		ls.add("stuck");
		ls.add('y');
		ls.add(24);
		ls.add(null);
		ls.add(true);
		ls.add('y');
		ls.add(null);
		
		System.out.println(ls);
		
		ls.clone();// make copy of whole set
		System.out.println(ls);
		
		//ls.clear();// remove all elements
		System.out.println(ls);
		
		ls.toArray();
		System.out.println(ls);
		System.out.println(ls.size());
		ls.add(34);
		System.out.println(ls);
		
		
		

	}

}
