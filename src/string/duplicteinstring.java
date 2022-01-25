package string;

public class duplicteinstring {

	public static void main(String[] args) {
		
		String s= "abc";
		String s1= "cde";
		
		for (int i=0;i<=s.length()-1;i++) 
		{
			for (int j=0;j<=s1.length()-1;j++) 
			{
				if(s.charAt(i)==s1.charAt(j)) 
				{
					System.out.println("duplicate character in two string is  :"+s1.charAt(j) );
				}
			}
		}
	}

}
