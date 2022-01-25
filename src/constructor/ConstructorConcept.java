package constructor;

public class ConstructorConcept {
	
	/*1.Constructor is a special type of method.
	2.Constructor is used for initializing the class instance variables.
	3.Constructor name should be same as class name
	4.Constructor will not return any value(not even void)
	5.Constructor will be invoked at the time of object creation.*/

	ConstructorConcept()
	{
		System.out.println("This is default constructor");
	}
	
	ConstructorConcept(int a, String b)
	{
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("This is parameterized constructor");
	}
	
	public static void main(String[] args) {
		
	ConstructorConcept var = new ConstructorConcept();
	new ConstructorConcept(10,"shiv");
	}

}
