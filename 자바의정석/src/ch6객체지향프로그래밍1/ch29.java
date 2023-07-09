package ch6객체지향프로그래밍1;

public class ch29 {

}

class TestClass {
	void instanceMethod() {}		//인스턴스 메서드
	static void staticMethod() {}	//클래스 메서드
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
//		instanceMethod();			인스턴스 메서드를 호출할 수 없다.
		staticMethod();
	}
}

class TestClass2 {
	int iv;		//인스턴스 변수
	static int cv;	//클래스 변수
	
	void instanceMethod() {	//인스턴스 메서드
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {	//static 메서드
//		System.out.println(iv);		인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);
	}
}
