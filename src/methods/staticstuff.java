package methods;

public class staticstuff {
//	static variable/ data member
	static int i = 10;
//	static method / function
 
//	
//	private static staticstuff object; what is necessicity of initalize object 
	 
	static void addition() 
	{
		int a = 10;
		 int b = 20;
		System.out.println("Addition of a & b is: " +(a+b));
		System.out.println("This is static method");
	}
//	static block
//	when jvm is executed static block so why  it is required main method 
//	then according to  jvm its should execute line by line but we get output shuffle
	
	static 
	{
	    System.out.println("This is static block");
		staticstuff object = new staticstuff();
    	object.addition();
    	System.out.println("Main method started");
    	System.out.println("This is static variable: "+i);
    	int var = staticstuff.i;
    	System.out.println("This is static variable: "+var);

	}
    public static void main (String [] args) 
    {
//      System.out.println("Main method started");
//    	System.out.println("This is static variable: "+i);
//    	int var = staticstuff.i;
//    	System.out.println("This is static variable: "+var);
//    	addition();
//		staticstuff object = new staticstuff();
//    	object.addition();

    	

    }
}
