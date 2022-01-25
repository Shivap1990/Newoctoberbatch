package keywords;

// this can be used to invoke current class constructor

public class ThisKeyword2 {
	
	ThisKeyword2()
	{
		System.out.println("This is zero parameter constructor");
	}
	

	ThisKeyword2(int a)
	{
		this();
		System.out.println("This is one parameter constructor");
	}
	

	ThisKeyword2(int a, int b)
	{
		this(10);
		System.out.println("This is two parameter constructor");
	}

	public static void main(String[] args) {
	
     new ThisKeyword2(10,20);
	}

}
