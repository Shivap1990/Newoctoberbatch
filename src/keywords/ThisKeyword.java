package keywords;

//  this can be used to refer current class instance variable

public class ThisKeyword {
	
	int deptno;//declaration
	String name; // declaration
	
//	1000 variables 4000 bytes memory
	void method(int deptno, String name) 
	{
		this.deptno= deptno;
		this.name= name;
		System.out.println(deptno);
		System.out.println(name);
	}

	public static void main(String[] args) {
		
	ThisKeyword obj = new ThisKeyword();
	obj.method(100, "star");

	}

}
