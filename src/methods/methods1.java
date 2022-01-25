package methods;

public class methods1 {
	
	public static void test() 
	{
		System.out.println("This is static method1");
	}
	public static void print() 
	{
		test();
		System.out.println("This is static method 2");
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started"); 
		test();
		System.out.println("Main method end");
		print();

	}

}
