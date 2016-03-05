package test;

public class Car {
	
	static String designer;
	
	private String colour;
	private String model;
	
	public Car(){
		colour="Red";
		model="Maruti";
	}
	
	public Car(String color, String m){
		this.colour=color;
		model=m;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Car car=(Car)obj;
		return this.getColour().equals(car.getColour()) && this.getModel().equals(car.getModel());
	}
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public static String getDesigner(){
		return designer;
	}
	

}
