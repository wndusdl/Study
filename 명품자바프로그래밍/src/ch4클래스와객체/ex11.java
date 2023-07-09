package ch4클래스와객체;

public class ex11 {

	public static void main(String[] args) {
		
	}
}

class StaticTest {
	static int a;
	static int getA() { return a; }	//1
	int b;
//	static int b;
	int getB() { return b; }		//2
//	int static getB() { return b; }		
	int f() { return getA(); }		//3
//	static int g() { return getB(); }	//4. 변수 g는 static인데 getB()는 static이 아니다.
}