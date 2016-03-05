package inheritance;

public class InhertanceWithPolyMorphism {
	public static void main(String[] args) {
		MobilePhone1 mobile=null;
		boolean conditio=false;
		
		if(conditio)
			mobile=new SmartPhone1();
		else
			mobile=new BasicPhone1();
		
		
		
		mobile.call(97879876876l);
		
	}
	
}

 class MobilePhone1{
	 public MobilePhone1( String name) {
		// TODO Auto-generated constructor stub
		 System.out.println("Mobile Init "+name );
	}
	 
	protected String dialPad;
	public void call(long number){
		System.out.println("Calling "+number);
	}
}

class BasicPhone1 extends MobilePhone1{
	public BasicPhone1() {
		// TODO Auto-generated constructor stub
		super("Test Phone ");
		System.out.println("Basic Phone");
		
	}
	
	public void call(long number){
		
		super.call(number);
		
		System.out.println("Calling Number using physical dial pad on phone ");
	}
}

class SmartPhone1 extends BasicPhone1{
	@Override
	public void call(long number) {
		//super.call(number);
		super.call(number);
		System.out.println("Calling using virtual dial pad");
		
	}
	
}
