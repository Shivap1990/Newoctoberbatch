package methodreturntype;

public class MethodRetType {
	
	/*Method
	Case-1-not taking parameters and also not returned any value
	Case-2-Not taking parameters but returning value
	Case-3-Taking parameters, but not returning any value.
	Case-4-Method is taking parameters and also returning a value*/

	 int x = 10;
	 int y = 20;
	 int z = x + y;
	
	void summation() // Case-1-not taking parameters and also not returned any value
	{
		MethodRetType obj = new MethodRetType();
	
		System.out.println(obj.z);
	}
	
	static double sum() // Case-2-Not taking parameters but returning value
	{
		MethodRetType obj = new MethodRetType();
	   System.out.println(obj.x);
		return(-40);
	}
	
	void sum(int a, int b, float c, double d) // Case-3-Taking parameters, but not returning any value.
	{
	
		System.out.println(a+b+c+d);
	}
	
	static char sum(int a, int b, char c) // Case-4-Method is taking parameters and also returning a value
	{
		return(500);
	}
	
	
	public static void main(String[] args) {
		
		MethodRetType obj = new MethodRetType(); // creating object of class
		
		System.out.println(sum(500,700,'S'));
		System.out.println(obj.sum());
		
		obj.sum(200,300, 15f, 40.0);
		obj.summation();

	}

}
