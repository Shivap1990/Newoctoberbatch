package oopsconcept.polymorphism;

public class MethodOverloading {
//	compile time polymorphism 
//	we can overload main method
	void test() 
	{
		System.out.println("This is zero parameter method");
	}
	
	void test(String a) 
	{
		System.out.println("This is one parameter method1");
	}
	
	void test (char a) 
	{
		System.out.println("This is one parameter method2");
	}
	
	void test(char a, int b) 
	{
		System.out.println("This is two parameter method");
	}

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.test();
		obj.test("Star");
		obj.test('a');
		obj.test('z',5);
		

	}

}
