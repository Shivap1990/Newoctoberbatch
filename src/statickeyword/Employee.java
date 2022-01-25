package statickeyword;

public class Employee {
//	non static/ instance variable
	String ename;
	double salary;
     int deptno = 12;
//	non static method
	void display() 
	{
		System.out.println("Employee name is :" +ename);
		System.out.println("Employee salary is :" +salary);
		System.out.println("Employee deptno is :" +deptno);
	}

	public static void main(String[] args) {
		System.out.println("------Employee 1st Data------");
		Employee obj1 = new Employee();
		obj1.ename = "John";
		obj1.salary = 40000.00;
		obj1.deptno = 20;
		obj1.display();
//		System.out.println(deptno);
		System.out.println();
		System.out.println("------Employee 2nd Data------");
		Employee obj2 = new Employee();
		obj1.ename = "Shiv";
		obj1.salary = 35000.00;
		obj1.display();
		System.out.println();
		System.out.println("------Employee 3rd Data------");
		Employee obj3 = new Employee();
		obj3.ename = "Scott";
		obj3.salary = 55000.00;
		obj3.deptno = 19;
		obj3.display();
		

	}

}
