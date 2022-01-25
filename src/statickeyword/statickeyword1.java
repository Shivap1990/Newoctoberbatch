package statickeyword;

public class statickeyword1 {
	
	static int a =10;
	int b = 20;
//	static method
	static void test() 
	{
		System.out.println(a);
		System.out.println("This is static method 1");
		print();
	}
	static void print() 
	{
		System.out.println("This is static method 2 ");
	}
//	non static method
	
	void method() 
	{
		System.out.println("This is non static method 2");
		display();
	}
	
	void display() 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("This is non static method 1");
		test();
	}
	
	public static void main(String[] args) {
	
	statickeyword1 object = new statickeyword1();
	object.method();
		
	}

}
