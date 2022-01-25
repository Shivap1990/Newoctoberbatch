package collection;

import java.util.HashSet;

public class setnew {

	public static void main(String[] args) {
	
		HashSet<Integer> hs1 = new HashSet<Integer>();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		System.out.println("HashSet1 is: "+hs1);
		
		HashSet <Integer> hs2 = new HashSet<Integer>();
		
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		System.out.println("HashSet2 is: "+hs2);
		
		// union operation
		
		hs1.addAll(hs2);
		System.out.println(hs1);
		
		// intersection operation
		
        hs1.retainAll(hs2);
        System.out.println(hs1);
        
        //difference
        hs1.removeAll(hs2);
       System.out.println("difference :"+hs1);
        
        //subset
        System.out.println(hs1.containsAll(hs2));// returns boolean value
		
	}

}
