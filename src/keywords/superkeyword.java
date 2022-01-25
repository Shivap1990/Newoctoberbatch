package keywords;

class a// super class
{
	int i = 10;
	void print(int i) 
	{
		this.i = i;
		System.out.println("This is parent class method");
	}
	a()
	{
		System.out.println("This is super class constructor");
	}
}

class b extends a
{
	int i = 20;
	
	void method() 
	{
		System.out.println(i);
		System.out.println(super.i);
	}
	
	void print (int i) 
	{
		super.print(10);
		System.out.println("This is child class method");
	}
	b()
	{
         super();
		System.out.println("This is child class constructor");
	}
}
public class superkeyword {

	public static void main(String[] args) {

       b obj = new b();
       obj.print(20);
       obj.method();
	}	

}
