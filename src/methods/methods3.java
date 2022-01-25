package methods;

public class methods3 {

		static int a =10;
		int b=20;	
	
	 static void addition() 
		{
			int a = 10;
			int b = 20;
			System.out.println("Sum of a & b is: " +(a+b));
		}
	  void substraction() 
		{
		int a = 50;
		int b = 10;
		System.out.println("Sub of a & b is: " +(a-b));
		}
		public static void main (String[]args) 
		{
			addition();
//			to create object
//			classname objectreference variable = new classname();
			methods3 a = new methods3();
			a.substraction();

		}
}
