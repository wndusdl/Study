package ch6객체지향프로그래밍1;
/*
  오버로딩이란 한 클래스 내에 같은 이름의 메서드가 여러 개 정의하는 것을 말한다. 
  1. 메서드 이름이 같아야한다.
  2. 매개변수 타입 또는 개수가 달라야한다.
  3. 반환 타입은 관계없다.
 */

public class ch31 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3, 3) 결과 : " + mm.add(3, 3));
		System.out.println("mm.add(3L, 3) 결과 : " + mm.add(3L, 3));
		System.out.println("mm.add(3, 3L) 결과 : " + mm.add(3, 3L));
		System.out.println("mm.add(3L, 3L) 결과 : " + mm.add(3L, 3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과 : " + mm.add(a));
	}
}

class MyMath3 {
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a+b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a+b;
	}
	
	long add(long a, long b) {
		System.out.print("1ong add(long a, long b) - ");
		return a+b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return result;
	}
}
