package conditionalstatements;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		
		String username1 = "John";
		String username2 = "David";
		String password = "John@123";

		if(username1 == "John" || username2 == "David") 
		{
			if(password == "John@123")
			{
			System.out.println("The user is valid");
			}
			else {
				System.out.println("The user is Invalid");
			}
		}
		else {
			System.out.println("Outer If Invalid");
		}
	}
}
