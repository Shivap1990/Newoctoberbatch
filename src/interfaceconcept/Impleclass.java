package interfaceconcept;

// If we have to inherit property from parent to child
// 1) class to class - extends
// 2) abstract class to class - extends
// 3) Interface to abstract class - implements
// 4) Interface to class - implements
// 5) Interface to Interface - extends
// 6) class to interface - not possible

public class Impleclass extends AbstractClass implements Car,  MotorCycle {
	
public static void main(String[] args) {
	
	Impleclass obj = new Impleclass();
    obj.car_start();
	obj.car_stop();
	obj.car_refuel();
	obj.test();
	obj.Apply_Brake();
	obj.Speed_Up();
	obj.ride();
	obj.spark();
	obj.vote();
//  obj.start();
    Car.start();// here it is possible to call method 
    //in interface in this class by interface name but 
    //not the object of same class why?
	System.out.println(b);
	
}

@Override
public void car_start() {
	System.out.println("This is car start method");
	
}

@Override
public void car_stop() {
	System.out.println("This is car stop method");
	
}

@Override
public void car_refuel() {
	System.out.println("This is car refuel method");
	
}

@Override
public void Apply_Brake() {
	System.out.println("It will stop");
	
}

@Override
public void Speed_Up() {
	System.out.println("It will accelerate");
	
}

@Override
void ride() {
	System.out.println("Riding on horse");
	
}

@Override
void spark() {
	System.out.println("Fuel is ignited");
	
}


	

}
