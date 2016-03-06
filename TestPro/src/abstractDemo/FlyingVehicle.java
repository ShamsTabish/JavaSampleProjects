package abstractDemo;

public class FlyingVehicle {

	public static void main(String[] args) {
		boolean availableCar = false;
		FlyingObject myFlyingObject;
		
		if (availableCar) {
			myFlyingObject = new FlyingCar();
			
		} else {
			myFlyingObject= new FlyingBike();
		}
		
		
		myFlyingObject.fly();

	}

}

interface FlyingObject {
	int x = 0;

	public void fly();
}

class FlyingBike implements FlyingObject {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("This is flying Bike");
	}

}
class Vehicle1{
	public void move(){
		System.out.println("Moving with my Vehicle");
	}
}
interface AutoDrive extends FlyingObject {
	public void drive();
	public void fly(String s);
}

class FlyingCar  extends Vehicle1 implements FlyingObject, AutoDrive  {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("This is a flying car");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Auto Drive Mode");
	}

	@Override
	public void fly(String s) {
		// TODO Auto-generated method stub
		
	}

}