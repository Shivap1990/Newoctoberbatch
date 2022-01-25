package string;

import java.util.Iterator;
import java.util.List;

public class splitstring {

	public static void main(String[] args) {

		/*String str = "shri,shyam-Suraj shashi?Anil";
		
		String[]  arrofstr =str.split("[,-? ]");
		for(int i=0;i<arrofstr.length;i++)
		{
		System.out.println(arrofstr[i]);
		}
		for (String a: arrofstr)
		{
		System.out.println(a);
		}*/
	
		String str1 = "I@am new-for@testing";
		String a[] = str1.split("[@, ,@,-]");
		/*for (String b:a)
		{
			System.out.println(b);
		}*/
		
		int i = 0;
		do
		{
			System.out.println(a[i]);
			i++;
		}while(i<a.length);
		
	}

}
