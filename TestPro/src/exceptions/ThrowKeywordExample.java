package exceptions;

public class ThrowKeywordExample {
	
	public static void main(String[] args) {
		ThrowKeywordExample t=new ThrowKeywordExample();
		
		try {
			System.out.println("Result"+t.thrower(0));
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" Value of a happens to b 0"+e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int thrower(int a) throws Exception{
		if(a==0)
			throw new Exception();
		return 4/a;
	}
}
