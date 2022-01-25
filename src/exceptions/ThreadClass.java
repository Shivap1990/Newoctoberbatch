package exceptions;

public class ThreadClass {

 public static void main(String[] args)  {

		
		System.out.println("This is start of main method");
		System.out.println("Main method is in progress");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		//System.out.println("This is End of main method");

	}
	
	/*public static void main(String[] args) {
		
		System.out.println("This is start of main method");
		System.out.println("Main method is in progress");
		
		try 
		{
		Thread.sleep(5000);
		//System.out.println("This is End of main method");
		}
		
		catch(InterruptedException c) 
		{
			
			System.out.println("This is Exit of main method");
		}
		
		finally 
		{
			System.out.println("Successful completion of main method");
		}
		//System.out.println("Completion of program");
	}*/

}