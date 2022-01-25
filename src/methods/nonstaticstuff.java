package methods;

public class nonstaticstuff 
{
//	non static variable
	int i = 10;

//non static method
 void test() 
 {
	System.out.println("This is non static method"); 
 }
// non static block
 {
	 System.out.println("This is non static block");
//	 nonstaticstuff object = new nonstaticstuff();
//	 System.out.println("This is non static variable value :"+object.i);
//	 object.test();
 }
 public static void main(String[] args) 
 {
	 System.out.println("Main method started");
	 nonstaticstuff object = new nonstaticstuff();
	 System.out.println("This is non static variable value :"+object.i);
	 object.test();
	 
 }

}