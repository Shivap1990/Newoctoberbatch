package oopsconcept.singleinheritance;

public class statickeyword {
	static int d = 35;
	int e = 24;
	static void drive()
	{
		int a = 50;
		int c = 20;
		System.out.println(a);
		System.out.println(c);
	}

	public static void main(String[] args) {
		classb obj = new classc();
		obj.display();
		
		/*statickeyword w = new statickeyword();
		drive();
		System.out.println(d);
		System.out.println(w.e);*/
		
	}

}
