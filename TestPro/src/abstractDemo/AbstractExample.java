package abstractDemo;
public class AbstractExample {
	public static void main(String[] args) {
		Vehicle vehicle=new Car();
		vehicle.move("Mumbai");
		vehicle.showSpeed();
	}
}


abstract class Vehicle{
	public abstract void move(String destination);
	public void showSpeed(){
		System.out.println("The maximum speed is "+ 100 );
	}
}
class Car extends Vehicle{

	@Override
	public void move(String destination) {
		// TODO Auto-generated method stub
		System.out.println("Moving with four wheels");
		
	}
	
}