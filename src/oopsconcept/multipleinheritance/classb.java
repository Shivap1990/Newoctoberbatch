package oopsconcept.multipleinheritance;

public class classb extends classa {
	
	int i = 50;
	int i1 = 30;
	
	void substraction() 
	{
		System.out.println("substraction of i & i1 is: "+(i-i1));
	}

	public static void main(String[] args) {
		
		classb obj = new classb();
		obj.substraction();
		obj.addition();// with inheritance
		
		classa obj1 = new classa();
		obj1.addition();// without inheritance

	}

}
