package ch6객체지향프로그래밍1;

public class ch24 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { //참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

class Data2 { int x; }

