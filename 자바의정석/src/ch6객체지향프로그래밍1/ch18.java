package ch6객체지향프로그래밍1;

public class ch18 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();	//인스턴스 생성
		
		long result1 = mm.add(5L, 3L);	//메서드 호출
		long result2 = mm.subtract(5L, 3L);	//메서드 호출
		long result3 = mm.multiply(5L, 3L);	//메서드 호출
		double result4 = mm.divide(5L, 3L);	//메서드 호출, 자동형변환
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a+b;
		return result;
	}
	
	long subtract(long a, long b) { return a-b; }
	long multiply(long a, long b) { return a*b; }
	double divide(long a, long b) { return a/b; }
}
