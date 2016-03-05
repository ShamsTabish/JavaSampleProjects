package test;

public class Sample {
	public static void main(String[] args) {
		StringBuffer st=new StringBuffer(4);
		
		StringBuilder str=new StringBuilder(3);
		
		str.append("Helloooooo");
		

		str.delete(0, 2);
		str.reverse();
		str.replace(0, 2,"Ohh");
		
		
		System.out.println(st);
		System.out.println("--"+str)
		;
		
	}
}
