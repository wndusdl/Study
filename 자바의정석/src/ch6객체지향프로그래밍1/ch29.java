package ch6��ü�������α׷���1;

public class ch29 {

}

class TestClass {
	void instanceMethod() {}		//�ν��Ͻ� �޼���
	static void staticMethod() {}	//Ŭ���� �޼���
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	
	static void staticMethod2() {
//		instanceMethod();			�ν��Ͻ� �޼��带 ȣ���� �� ����.
		staticMethod();
	}
}

class TestClass2 {
	int iv;		//�ν��Ͻ� ����
	static int cv;	//Ŭ���� ����
	
	void instanceMethod() {	//�ν��Ͻ� �޼���
		System.out.println(iv);
		System.out.println(cv);
	}
	
	static void staticMethod() {	//static �޼���
//		System.out.println(iv);		�ν��Ͻ� ������ ����� �� ����.
		System.out.println(cv);
	}
}
