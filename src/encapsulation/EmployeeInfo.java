package encapsulation;

public class EmployeeInfo {
	
	private String name = "Mahesh";
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		
		EmployeeInfo emp = new EmployeeInfo();
//		emp.setName("Sam");
		System.out.println(emp.getName());
		emp.setAge(25);
		System.out.println(emp.getAge());
	}

}
