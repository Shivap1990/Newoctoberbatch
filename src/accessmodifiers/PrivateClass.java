package accessmodifiers;

public class PrivateClass {

	private int a = 10;
	
	private static void test() 
	{
		PrivateClass pr = new PrivateClass();
		System.out.println(pr.a);
		System.out.println("This is private method");
	}
	public static void main(String[] args) {
	    
		PrivateClass pr = new PrivateClass();
		
		System.out.println(pr.a);
		PrivateClass.test();

	}

}
