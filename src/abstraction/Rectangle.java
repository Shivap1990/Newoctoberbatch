package abstraction;

public class Rectangle extends GraphicObject{
	
	Rectangle()
	{
		super(10);
		
	}

	public static void main(String[] args) {
		

	}

	@Override
	void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	void resize() {
		System.out.println("Resize a rectangle");
		
	}

}
