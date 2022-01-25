package statickeyword;

public class method1 {
	
	// methods may take parameter or may not
	
 void test() 
 {
    System.out.println("This is zero parameter method");	
 }
 
 void print(int a) 
 {
	 System.out.println(a);
	 System.out.println("This is one parameter method");	
 }
 
 void display(int a, int b, char c) 
 {
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 System.out.println("This is three parameter method");	
 }

	public static void main(String[] args) {

     method1 obj = new method1();
     obj.test();
     obj.print(1);
     obj.display(55, 45000, 'n');
     
	}

}
