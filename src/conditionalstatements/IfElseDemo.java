package conditionalstatements;

public class IfElseDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		if(a == b) {
       System.out.println("a is equal to b");
	}
		if(a < b) {
			System.out.println("a is less than b");
		}
		if(a > b) {
			System.out.println("a is greater than b");
		}
		if(a <= b) {
			System.out.println("a is less than or equal to b");
		}
		if(a >= b) {
			System.out.println("a is greater than or equal to b");
		}
		else {
        System.out.println("a is not equal to b");
}
}
}