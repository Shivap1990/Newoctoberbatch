package accessmodifiers;

public class proclass  {
	

	public static void main(String[] args) {
		
		ProtectedClass a = new ProtectedClass();
		System.out.println(a.var1);
		System.out.println(a.var);
		a.drive();
		a.smartdrive();

	}

}
