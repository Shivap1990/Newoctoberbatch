package keywords;

// this can be used to invoke or call current class method

public class ThisKeyword1 {
	
	void force() 
	{
		System.out.println("This is force method");
	}
	
	void pressure()
	{
		this.force();
		System.out.println("This is pressure method");	
	}

	public static void main(String[] args) {
	
		ThisKeyword1 obj = new ThisKeyword1();
		obj.pressure();

	}

}
