package string;

public class stringIndexOutOfBoundsException {

	public static void main(String[] args) {
		
		String s = "Practice makes";
		String s1 = "Perfect" ;
		
		System.out.println(s.isEmpty());//false
		System.out.println(s.length());//14
		System.out.println(s.toLowerCase());//PRACTICE MAKES--practice makes
		System.out.println(s.toUpperCase());//PRACTICE MAKES
		System.out.println(s.indexOf('z'));//3
		System.out.println(s1.indexOf('z'));//11
		System.out.println(s.lastIndexOf('e'));//12
		try 
		{
		System.out.println("This is try block");
		System.out.println(s1.charAt(-2));//space, e,0,blank
		
		}
		catch(StringIndexOutOfBoundsException c) 
		{
			System.out.println("This is out of bound exception");
		}
		finally 
		{
			System.out.println("This is final");
		}
		System.out.println(s.charAt(10));//a
		System.out.println();//blank
		System.out.println(s.concat(" "+s1));//practice makesPerfect, Practice makes Perfect
		System.out.println(s.startsWith("Pra"));
		System.out.println(s1.endsWith("ct"));
		
	}

}
