package ch6��ü�������α׷���1;

public class ch27 {

	public static void main(String[] args) {
		//Ŭ���� �޼��� ȣ��, �ν��Ͻ� �������� ȣ�� ����
		System.out.println("[ Ŭ���� �޼��� ]");
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		System.out.println("===================================");
		MyMath2 m = new MyMath2();
		m.a = 200L;
		m.b = 100L;
		
		//�ν��Ͻ� �޼���� ��ü���� �Ŀ��� ȣ���� ������
		System.out.println("[ �ν��Ͻ� �޼��� ]");
		System.out.println(m.add());
		System.out.println(m.subtract());
		System.out.println(m.multiply());
		System.out.println(m.divide());
	}
}

class MyMath2 {
	long a,b;
	
	//�ν��Ͻ� ���� a,b���� �̿��ؼ� �۾��ϹǷ� �Ű������� �ʿ����.
	long add() { return a+b; }	//a,b�� �ν��Ͻ� ����
	long subtract() { return a-b; }
	long multiply() { return a*b; }
	double divide() { return a/b; }
	
	//�ν��Ͻ� ������ ������� �Ű����������� �۾��� �����ϴ�.
	static long add(long a, long b) { return a+b; } //a,b�� ��������
	static long subtract(long a, long b) { return a-b; } 
	static long multiply(long a, long b) { return a*b; }
	static double divide(long a, long b) { return a/b; } 
}
