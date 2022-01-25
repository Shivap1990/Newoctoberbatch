package string;

public class StringClass {

	public static void main(String[] args) {
	
		 String s1= "Shri";
		 String s2 = new String ("Shri");
		 String s3= "Shri";
		 String s4 = new String("Shri");
		 
		 System.out.println(s1==s2);//false
		 System.out.println(s1==s3);//true
		 System.out.println(s1==s4);//false
		 System.out.println(s2==s4);// false
		 System.out.println(s1.equals(s2));//true
		 System.out.println(s1.equals(s3));//true
		 System.out.println(s1.equals(s4));//true
		 System.out.println(s2.equals(s3));//true
		 System.out.println(s3.equals(s4));//true
		 
		 
		 

	}

}
