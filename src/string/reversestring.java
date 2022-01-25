package string;

public class reversestring {

	public static void main(String[] args) {
		
			//using for loop
			String s="SHIVSHANKAR";//string litrals
			String rev="";
			for(int i=s.length()-1;i>=0;i--)//integer
			{
				rev=rev+s.charAt(i);
			}System.out.println(rev);
		

	}

}
