package oopsconcept.multipleinheritance;

public class classa {
	
    int a = 10;
    int b = 30;
	
	void addition() 
	{
		System.out.println("Adddition of a & b is: "+(a+b));
	}

	public static void main(String[] args) {
		classa object = new classa();
		object.addition();
		
		object.a = 70;
		object.b = 30;
		object.addition();;
		

	}

}
