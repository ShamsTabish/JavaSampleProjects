package inheritance;

public class OverLoading {
	public static void main(String[] args) {
		Maths maths=new Maths();
		System.out.println(maths.add(1f, 2f));
	}
	
}

class Maths{
	public int add(int a, int b){
		System.out.println("With two");
		return a+b;
	}
	
	public float add(float a, float b){
		return a+b;
	}
	
	public int add(int a, int b, int c){
		System.out.println("Tree ");
		return a+b+c;
	}
}