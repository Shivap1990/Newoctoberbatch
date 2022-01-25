package oopsconcept.hierarchical;

class parent12 
{
	
	void parent12method() 
	{
		System.out.println("This is parent method");
	}	
}

class child1 extends parent12
{
	void child11method() 
	{
		System.out.println("This is child method1");
	}
}

class child2 extends parent12
{
	void child12method() 
	{
		System.out.println("This is child method2");
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		
		child1 obj = new child1();
		obj.child11method();
	     obj.parent12method();
		
		child2 obj1 = new child2();
		obj1.child12method();
		obj1.parent12method();
	
	}

}
