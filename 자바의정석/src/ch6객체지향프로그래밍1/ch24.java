package ch6��ü�������α׷���1;

public class ch24 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) { //������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

class Data2 { int x; }

