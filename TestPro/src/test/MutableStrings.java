package test;

public class MutableStrings {
	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer("Name:");
		stringBuffer.append(" Ajay");

		System.out.println(stringBuffer);
		
		stringBuffer.replace(0, 5, "First Name:");
		
		System.out.println(stringBuffer);
		
		StringBuilder stringBuilder=new StringBuilder("Name: ");
		
		stringBuilder.append("Sanjay");
		System.out.println(stringBuilder);
		
	}
}
