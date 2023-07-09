package ch4클래스와객체;

public class ex13 {

	public static void main(String[] args) {
//		int sum = f(2,4);
		int sum = Test.f(2,4);
	}
}

class Test {
//	public int f(int a, int b) {
//		return a + b;
//	}
	
	public static int f(int a, int b) {
		return a + b;
	}
}