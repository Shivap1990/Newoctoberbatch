package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//List is a interface
//Insertion order preserved
//duplicates are allowed

public class arraylist {
	
	// child class of List Interface

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(5);//add elements in list
		
		list.add(25.35f);
		
		list.add('m');
		
		list.add(true);
		
		list.add("Sachin");
		
		list.add(20.8);
		
		
		System.out.println(list);
		System.out.println("Size of arraylist is: " +list.size());
		
		// remove elements from specified index 
		list.remove(4);
		System.out.println("After removing arraylist: " +list);
		System.out.println("Size after removing element: " +list.size());
		
		// add elements in list with position
		list.add(3,99);
		System.out.println("New arraylist: " +list);
		System.out.println("Size of new arraylist: " +list.size());
		
		// get element value at specified index
         System.out.println(list.get(4));
         
         // replace specified index element with new value
         list.set(2, "smart");
         System.out.println(list);
         
         // gives particular element is present or not in true or false
         System.out.println(list.contains(99));
         System.out.println(list.contains("free"));
         
         // gives boolean value
         System.out.println(list.isEmpty());
         System.out.println();
         
         //method-1
         System.out.println("-----Reading arraylist using for loop---- ");
         for(int i=0;i<list.size();i++) 
         {
        	// System.out.println(list.get(i));
        	 System.out.print(list.get(i) +" ");
         }
         
         System.out.println();
         //method-2
         System.out.println("----- Reading arraylist using for each loop----");
         for(Object arr:list) 
         {
        	 System.out.println(arr);
         }
         
         System.out.println();
         //method-3
         System.out.println("----reading arraylist using Iterator----");
         
         Iterator itr = list.iterator();
         
         while(itr.hasNext()) 
         {
        	 System.out.println(itr.next());
         }
         
         //method -4
         System.out.println();
         System.out.println("----reading arraylist using do while loop----");
         
		int i=0;
		do 
		{
        	 System.out.println(list.get(i));
        	 i++;
         } while(i<=5);
	}

}
