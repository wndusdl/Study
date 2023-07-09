package ch4클래스와객체;

public class ex12 {

	public static void main(String[] args) {
//		StaticSample.x = 5;			//1
		StaticSample.y = 10;		//2
		int tmp = StaticSample.f();	//3
		StaticSample a = new StaticSample();
		tmp = a.y;					//4
	}
}

class StaticSample {
	public int x;
	public static int y;
	public static int f() { return y; }
}