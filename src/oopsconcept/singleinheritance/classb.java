package oopsconcept.singleinheritance;

public class classb extends classa {
	
	classb(int a)
	{
		super("ab");
		System.out.println("This is child constructor");
	}
	
	void display() 
	{
		System.out.println("This is class B method");
	}

	public static void main(String[] args) {
		
		classb s =new classb(10);
		
		s.display();
		System.out.println(s.a);
		

	}

}
