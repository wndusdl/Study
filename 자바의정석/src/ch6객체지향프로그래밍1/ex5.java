package ch6객체지향프로그래밍1;

public class ex5 {

	//args, card 지역변수
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}

class PlayingCard {
	//인스턴스 변수
	int kind;
	int num;
	
	//클래스 변수
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		//지역변수
		kind = k;
		num = n;
	}
}