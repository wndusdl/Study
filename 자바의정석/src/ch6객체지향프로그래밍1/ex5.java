package ch6��ü�������α׷���1;

public class ex5 {

	//args, card ��������
	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
	}
}

class PlayingCard {
	//�ν��Ͻ� ����
	int kind;
	int num;
	
	//Ŭ���� ����
	static int width;
	static int height;
	
	PlayingCard(int k, int n) {
		//��������
		kind = k;
		num = n;
	}
}