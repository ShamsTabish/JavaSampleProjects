package inheritance;

public class InhertanceBasic {
	public static void main(String[] args) {
		MobilePhone mobile=new BasicPhone();
		mobile.showCalculator();
		mobile.call(97879876876l);
	}
	
}

abstract class MobilePhone{
	protected String dialPad;
	public void call(long number){
		System.out.println("Calling "+number);
	}
	public abstract void showCalculator();
}

class BasicPhone extends MobilePhone{
	public void showCalculator(){
		System.out.println("Sarting calcultor");
	}
}

class SmartPhone extends BasicPhone{
	private String smartTouch="Capacitive";
	public void getMyLocation(){
		System.out.println("Showing GPS Location  ");
	}
	public void senseTouch(){
		System.out.println("Sensing using "+smartTouch);
	}
	
}
