package collection;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// insertion order is not maintained & duplicates are not allowed
		HashSet s  = new HashSet();
		
	    s.add(25);
		s.add('s');
		s.add("strange");
		s.add("start");
		s.add(245.67d);
		s.add(true);
		s.add(null);
		s.add(true);
		System.out.println(s);
		
		s.remove("start");
		System.out.println(s);
		
		s.add("false");
		System.out.println(s);
		
		s.add(false);
		System.out.println(s);
		
		System.out.println(s.contains("straight"));// returns boolean value
		
		System.out.println(s.isEmpty());// returns boolean value
		
		HashSet hs = new HashSet();
		hs.addAll(s);//addAll method
		System.out.println(hs);
	}

}
