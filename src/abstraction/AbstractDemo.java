package abstraction;

public class AbstractDemo  {

	public static void main(String[] args) {
		
	GraphicObject obj = new Rectangle();
	obj.draw();
	obj.resize();
	
	
   GraphicObject obj1 = new Circle();
   obj1.draw();
   obj1.resize();
	}
	
}
