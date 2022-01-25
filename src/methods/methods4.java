package methods;

public class methods4 {


		static void test() 
		{
			System.out.println("This is static mehod");
		}
		static void print() 
		{
			System.out.println("This is  static method 2");
		}
		void display() 
		{
			System.out.println("This is non static method");
		}

			public static void main(String[] args) 
			{
				test();
				print();
				methods4.print();
				methods4 objecref = new methods4();
				objecref.display();
				objecref.test();
				objecref.print();
			}
	}


