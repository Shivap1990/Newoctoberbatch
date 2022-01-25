package oopsconcept.multipleinheritance;

public class MountainBike extends Bicycle {
	
	int seatheight = 1;
	
	void seatheight() 
	{
		System.out.println("The vehicle seat height will be adjusted");
	}
	
	public static void main(String[] args) {
		
		MountainBike obj = new MountainBike();
		System.out.println(obj.gear);
		System.out.println(obj.speed);
		System.out.println(obj.seatheight);
		obj.SetGear();
		obj.ApplyBrake();
		obj.SpeedUp();
		obj.seatheight();	
	}
}
