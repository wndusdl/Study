package ch6객체지향프로그래밍1;

public class ch10 {

	public static void main(String[] args) {
		
	}
}

class Time {
	private int hour;
	private int minute;
	private float second;
	
	//hour의 값을 변경하기 위한 메서드, 지정한 값이 0보다 작거나 23보다 크면
	//즉, 유효한 값이 아니면 변경하지 않고 메서드를 종료(return)한다.
	public void setHour(int h) {
		if(h<0 || h>23) return;
		hour = h;	//지정된 값(h)이 유효한 경우에만 hour를 변경
	}
}
