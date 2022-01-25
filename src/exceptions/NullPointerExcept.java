package exceptions;

public class NullPointerExcept {

	public static void main(String[]args) {
		
	System.out.println("The program is started");
	
	try 
     {
	String s = null;
	System.out.println(s.length());
	}
	
	catch(ArithmeticException c) 
	{
		System.out.println("We are in first catch block");
	}
	
	catch(NullPointerException c) 
	{
		System.out.println("we are in 2nd catch block");
	}
	
	System.out.println("The program is exited");

}
}