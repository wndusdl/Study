package ch6객체지향프로그래밍1;

//두 점의 거리를 계산하는 getDistance()를 완성하시오.

public class ex4 {

	public static void main(String[] args) {
		System.out.println(ex6_4.getDistance(1, 1, 2, 2));
	}
}

class ex6_4{
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x-1)*(x-x1)+(y-y1)*(y-y1));
	}
}
