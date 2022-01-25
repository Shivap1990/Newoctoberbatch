package accessmodifiers;

public class ProtectedClass {
//	 take a=97, b=98, c=99,----- z=122
	
	    protected static int var = '>';
	    protected int var1 = 10;
	    
	    protected void drive() 
	    {
	    	System.out.println(var);
	    	System.out.println(var1);
	    	System.out.println("it is manual drive");
	    	smartdrive();
	    }
	    
	    protected static void smartdrive () 
	    {
	    	ProtectedClass pro = new ProtectedClass();
	    	System.out.println(var);
	    	System.out.println(pro.var1);
	    	System.out.println("it is automatic drive"); 
	    }

	public static void main(String[] args) {
		
		ProtectedClass pro = new ProtectedClass();
    	    pro.drive();
	

	}

}
