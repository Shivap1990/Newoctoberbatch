package abstraction;


public class Circle extends GraphicObject {
	
	/*Circle()
	{
		super(15);
		
	}*/


	public static void main(String[] args) {
		
		Circle cr =new Circle();
		cr.draw();
		cr.resize();
		cr.add();
		cr.test();
		

	}

	@Override
	void draw() {
		System.out.println("Draw a circle");
		
	}

	@Override
	void resize() {
		System.out.println("Resize a circle");
		
	}


	@Override
	void add() {
		System.out.println("perfect");
		
	}


	@Override
	void test() {
		System.out.println("smart");
		
	}

}
