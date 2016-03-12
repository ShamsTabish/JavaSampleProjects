package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
	public static void main(String[] args)  {
		
		ThrowsExample o=new ThrowsExample();
		try {
			o.exceptionThrower();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("End of Program");
		
	}
	
	
	public void exceptionThrower() throws FileNotFoundException{
		FileReader file=new FileReader("");
	}
	
}
