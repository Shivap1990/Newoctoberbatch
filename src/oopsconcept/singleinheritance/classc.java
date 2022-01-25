package oopsconcept.singleinheritance;

public class classc extends classb {
	int b= 10;
	
	void country()
	{
		int c = 20;
		int d = 30;
		System.out.println(c);
		System.out.println(d);
	}
	classc()
	{
		super(10);
		System.out.println("This is c class constructor");
	}
	@Override
	void display() 
	{
		System.out.println("This is overrided method");
	}

	public static void main(String[] args) {
		classc o =new classc();
		o.country();
		
		

	}

}
