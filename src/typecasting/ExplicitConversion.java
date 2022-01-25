package typecasting;

public class ExplicitConversion {
	
	//narrowing, cast up
    // bigger to smaller data types

	public static void main(String[] args) {
		
		long l = 25;
		int i = (int) l;
		short s = (short) i;
		byte b= (byte) s;
		double d =0.003251;
		float f =(float) d;
		
		System.out.println(i);
		System.out.println(s);
		System.out.println(b);
		System.out.println(f);
		
	}

}
