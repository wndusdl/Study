package ch6객체지향프로그래밍1;

public class ex6 {

	public static void main(String[] args) {
		//인스턴스 메서드 사용시
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
		
		//static 메서드 사용시
//		System.out.println(Exercise6_6.getDistance(1,1,2,2));
	}
}

class MyPoint {
	//인스턴스 변수
	int x;
	int y;
	
	//생성자
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//인스턴스 메서드
	//인스턴스 변수(x,y)가 있으니 매개변수로 x1, y1을 제공받으면 됨
	//인스턴스와 관계있으니 static 사용 불가능
	 double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
}