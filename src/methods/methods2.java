package methods;

public class methods2 {

public static void main(String[] args) 
	{
	System.out.println("Main method started");
	System.out.println("main method ended");
	display();
	}
public static void test() 
{
	System.out.println("This is static method");
}
public static void printvalue() 
{
	test();
	System.out.println("This is static method 2");
}
public static void display() 
{
	printvalue();
	System.out.println("This is display method");
}
}