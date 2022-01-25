package oopsconcept.polymorphism;
// run time polymorphism

class parent{
	
	void parent_property() 
	{
		System.out.println("land+business");
	}
	
	void marriage() 
	{
		System.out.println("Arrange marriage");
	}
}
	
	class child extends parent{
		
		void child_property()
		{
			System.out.println("Doing own job");
		}
		@Override
		void marriage() 
		{
			System.out.println("Love marriage");
		}
	}


public class MethodOverride {

	public static void main(String[] args) {
		
  System.out.println("----- Parent Methods-----");
  parent paraobj = new parent();
  paraobj.parent_property();
  paraobj.marriage();
  
  System.out.println("----Child Methods----");
  
      child chobj = new child();
      chobj.child_property();
      chobj.marriage();
	}
}

