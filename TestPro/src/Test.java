import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
	private String s="";
	public static void main(String[] args) {
		int []a=new int[2];
		Test t=new Test();
		System.out.println(t.s);
		
		try{
			a[3]=399;
		}catch(ArithmeticException e){
			System.out.println("Arithemtic "+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Out of Index "+e);
		}	
		catch(RuntimeException re){
			System.out.println("Runtime "+re);
		}
		catch(Exception e){
			System.out.println("General Ex "+e);
		}
		
		catch(Throwable tw){
			System.out.println("Throwable "+tw);
		}
		
		finally{
			System.out.println(a);
		}
		
	
		
		
	}
}
