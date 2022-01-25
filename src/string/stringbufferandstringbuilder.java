package string;

public class stringbufferandstringbuilder {

	public static void main(String[] args) {
		
		System.out.println("This is String class--Immutable");
		
		String s = "Shraman";//Immutable-not change
		String s1=s.concat(" Joshi");
		System.out.println(s);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("This is StringBuffer class--mutable");
		
		StringBuffer sb = new StringBuffer("Aniket");// mutable--changable
		
		sb.append(" Yemekar");
		sb.append(" Choudhary");
		System.out.println(sb);
		
		System.out.println();
		
		System.out.println("This is StringBuilder class--mutable");
		
		StringBuilder sb1 = new StringBuilder("Pranav");
		
		sb1.append(" Shinde ");
		sb1.append("Gore ");
		sb1.append('C');
		System.out.println(sb1);

	}

}
