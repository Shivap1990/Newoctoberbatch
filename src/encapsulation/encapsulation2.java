package encapsulation;

public class encapsulation2 {

	public static void main(String[] args) {
		encapsulation1 obj = new encapsulation1();
		obj.setAccbalance(15000.00);
		System.out.println(obj.getAccbalance());
		
		
		EmployeeInfo ab = new EmployeeInfo();
		ab.setName("Raj");
		System.out.println(ab.getName());
		ab.setAge(35);
//		int i = ab.getAge();
		System.out.println(ab.getAge());


	}

}
