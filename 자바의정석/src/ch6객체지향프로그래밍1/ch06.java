package ch6객체지향프로그래밍1;

public class ch06 {

	public static void main(String[] args) {
		//Tv인스턴스를 참조하기 위한 변수 t 선언 후 Tv 인스턴스 생성
		Tv t = new Tv();	
		t.channel = 7;
		t.channelDown();
		System.out.println("현재 채널은 " + t.channel + "번 입니다!");
	}
}

class Tv2 {
	//속성(변수)
	String color;
	boolean power;
	int channel;
	
	//기능(메서드)
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}