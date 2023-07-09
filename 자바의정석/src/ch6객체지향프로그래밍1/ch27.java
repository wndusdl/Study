package ch6객체지향프로그래밍1;

public class ch27 {

	public static void main(String[] args) {
		//클래스 메서드 호출, 인스턴스 생성없이 호출 가능
		System.out.println("[ 클래스 메서드 ]");
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		System.out.println("===================================");
		MyMath2 m = new MyMath2();
		m.a = 200L;
		m.b = 100L;
		
		//인스턴스 메서드는 객체생성 후에만 호출이 가능함
		System.out.println("[ 인스턴스 메서드 ]");
		System.out.println(m.add());
		System.out.println(m.subtract());
		System.out.println(m.multiply());
		System.out.println(m.divide());
	}
}

class MyMath2 {
	long a,b;
	
	//인스턴스 변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() { return a+b; }	//a,b는 인스턴스 변수
	long subtract() { return a-b; }
	long multiply() { return a*b; }
	double divide() { return a/b; }
	
	//인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) { return a+b; } //a,b는 지역변수
	static long subtract(long a, long b) { return a-b; } 
	static long multiply(long a, long b) { return a*b; }
	static double divide(long a, long b) { return a/b; } 
}
