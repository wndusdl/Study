package ch6객체지향프로그래밍1;

public class ex21 {

	public static int abs(int value) {
		//value의 값이 양수이면 그대로 반환, 음수이면 부호를 바꿔서 반환
		return value>=0 ? value : -value;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "의 절대값: " + abs(value));
		
		value = -10;
		System.out.println(value + "의 절대값: " + abs(value));
	}
}
