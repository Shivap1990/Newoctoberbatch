package typecasting;

public class ImplicitConversion {

	public static void main(String[] args) {
	
		// widening, cast down
		// smaller to bigger data types
		
		byte a=10;// 1 byte
		short b = a;// 2 bytes
		int c = b;// 4 bytes
		long l = c;// 8 bytes
		float f = 15.25f;// 4 bytes
		double d = f;
		
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);

	}

}
