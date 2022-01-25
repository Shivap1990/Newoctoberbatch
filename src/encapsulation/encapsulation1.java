package encapsulation;

public class encapsulation1 {
	
	// user - authentication - ATM password
	// validations internet banking - username & password - profile password
	// validation - passbook aadhar card
	
	private double accbalance = 2000000.00;

	public double getAccbalance() {
		return accbalance;
	}

	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}

	public static void main(String[] args) {
		encapsulation1 obj = new encapsulation1();
		//obj.setAccbalance(20000.00);
		System.out.println(obj.getAccbalance());

	}

}
