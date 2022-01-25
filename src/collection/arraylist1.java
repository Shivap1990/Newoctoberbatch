package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylist1 {
	//collection is interface
    // collections is inbuilt class
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add("Nitin");
		list.add("Prem");
		list.add("Onkar");
		list.add("Chetan");
		list.add("om");
		list.add("Balaji");
		System.out.println(list);
		
		List dup = new ArrayList();
		
		dup.addAll(list);// creating duplicate of array
		System.out.println(dup);
		
		//dup.removeAll(list);// delete all element & create empty array
		//System.out.println(dup);
		
		Collections.sort(dup);// sort list alphabetically
		System.out.println(dup);
		
		Collections.sort(dup,Collections.reverseOrder()); // sort list in reverse order
		System.out.println(dup);
		
		Collections.shuffle(dup);//make shuffling in list
		System.out.println(dup);
		
		
		
		
		
		
		
		
		
		
	}

}
