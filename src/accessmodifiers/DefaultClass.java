package accessmodifiers;

public class DefaultClass {
	int a =10;
	static int b = 20;
	
	void check() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("System is OK");
	}
	
	static void test() 
	{
		DefaultClass dc = new DefaultClass();
		dc.check();
		System.out.println("Test is conducted");
	}

	public static void main(String[] args) {
	
	  test();

	}

}
