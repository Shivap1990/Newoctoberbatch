package abstraction;

public abstract class GraphicObject {
	
	abstract void draw();
	abstract void resize();
	/*GraphicObject(int a)
	{
		System.out.println("This is constructor in abstract class");
	}*/
	
	abstract void add();
	{
		System.out.println("This is add method");
	}
	
	abstract void test();
	{
		System.out.println("This is final method");
	}

	public static void main(String[] args) {
		
	}

}
