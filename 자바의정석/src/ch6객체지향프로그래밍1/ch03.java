package ch6객체지향프로그래밍1;

public class ch03 {
	
}

class Tv1 {
	//속성(변수)
	String color;	//색깔
	boolean power;	//전원상테
	int channel;	//채널
	
	//기능(메서드)
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}
