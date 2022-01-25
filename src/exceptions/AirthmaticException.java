package exceptions;

public class AirthmaticException {

	public static void main(String[] args) {
		
		System.out.println("The start of program");
		System.out.println("Program execution is running");
		
		try
		{
		int a = 50/0; // Airthematic exception
		System.out.println(a);
		}
		
		catch(Exception c) 
		{
			System.out.println("Enter into catch block");
		}
		System.out.println("program is completed");

	}

}
