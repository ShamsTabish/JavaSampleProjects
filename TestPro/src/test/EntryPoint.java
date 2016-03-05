package test;

public class EntryPoint {

	public static void main(String[] args) {
		Car.designer="Sanjay";
		Car maruti;
		
		System.out.println(Car.getDesigner());
		
		
		
		maruti=new Car("Black","Swift");
		
		Car.designer="Ajay";
		System.out.println(maruti);
		
		
		Car city=new Car("Red","BMW");
		
		System.out.println(Car.designer);
		
		city.setColour("White");
		
		System.out.println("The Color is "+maruti.getColour()+" Model "+maruti.getModel());
	}
	
	
	 static{
		System.out.println("Hello");
	}
	
}
