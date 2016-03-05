package test;

public class StringImmutable {
	public static void main(String[] args) {
		String a="Hello";
		String b=new String("Hello");
		int x=34;
		if(a==b)
			System.out.println("Same");
		else
			System.out.println("Different");
	}
}
