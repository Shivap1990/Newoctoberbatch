package statickeyword;

public class statickeyword 
{
	static int a =10;
	int b = 20;
public static void addition() 
{
	System.out.println("This is static method");
}
public static void test() 
{
	addition();
	System.out.println(a);
	statickeyword object1 = new statickeyword();
	System.out.println(object1.b);
}
public void print() 
{
	System.out.println(b);
	System.out.println(a);
	addition();
	test();
	System.out.println("This is non-static method");
}
public static void main(String[]args) 
{
//	int c = 30;
	test();
	statickeyword object = new statickeyword();
	object.print();
}
}
