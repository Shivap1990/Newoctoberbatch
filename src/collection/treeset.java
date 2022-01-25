package collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		
		// insertion order is not maintained but arrange only in ascending order
		// duplicates not allowed

		SortedSet<Character> ts = new TreeSet();
		
		ts.add('x');
		ts.add('n');
		ts.add('d');
		ts.add('h');
		ts.add('n');
		System.out.println(ts);
		

	}

}
