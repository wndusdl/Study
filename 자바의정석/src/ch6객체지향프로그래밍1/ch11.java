package ch6객체지향프로그래밍1;

public class ch11 {

	public static void main(String[] args) {
		
	}
}

class Variables {
	//클래스 영역
	int iv;	//인스턴스 변수
	static int cv;	//클래스 변수(static변수, 공유변수)
	
	void method() {
		//메서드 영역
		int iv = 0;	//지역변수
	}
}