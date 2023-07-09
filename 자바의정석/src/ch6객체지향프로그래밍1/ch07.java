package ch6객체지향프로그래밍1;

public class ch07 {

	public static void main(String[] args) {
		Tv t1 = new Tv();	
		Tv t2 = new Tv();	
		System.out.println("t1의 현재 채널은 " + t1.channel + "번 입니다!");
		System.out.println("t2의 현재 채널은 " + t2.channel + "번 입니다!");
		
		t1.channel = 7;
		System.out.println("t1의 현재 채널은 " + t1.channel + "번으로 변경하였습니다!");
		
		System.out.println("t1의 현재 채널은 " + t1.channel + "번 입니다!");
		System.out.println("t2의 현재 채널은 " + t2.channel + "번 입니다!");
	}
}

class Tv {
	//속성(변수)
	String color;
	boolean power;
	int channel;
	
	//기능(메서드)
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}