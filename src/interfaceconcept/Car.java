package interfaceconcept;

public interface Car {
	
	int a = 10; // by default it is static & final
	
	void car_start();// by default public and final
	
	void car_stop();// un-implemented methods
	
	void car_refuel();
	
	default void test() 
	{
		System.out.println("This is default method in interface");
	}
	static void start() 
	{
		System.out.println("This is start method");
	}
	
	private void end() 
	{
		System.out.println("This is end method");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		start();
	
		
		
		
	}

}
