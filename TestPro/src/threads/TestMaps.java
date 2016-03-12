package threads;

import java.util.HashMap;
import java.util.Map;

public class TestMaps {
	public static void main(String[] args) {
		MyTest t1 = new MyTest(20, 10);

		System.out.println("Hash code " + t1.hashCode());
		Map<MyTest, String> map = new HashMap<MyTest, String>();
		map.put(t1, "First Object");

		t1.setA(10000);
		t1.setB(40);

		System.out.println("Hash code " + t1.hashCode());

		System.out.println("Map Val " + map.get(t1));

	}
}

class MyTest {
	int a, b;
//
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
	
	

	@Override
	public String toString() {
		return "MyTest [a=" + a + ", b=" + b + "]";
	}

	public MyTest(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}