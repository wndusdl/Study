package ch6��ü�������α׷���1;

public class ch06 {

	public static void main(String[] args) {
		//Tv�ν��Ͻ��� �����ϱ� ���� ���� t ���� �� Tv �ν��Ͻ� ����
		Tv t = new Tv();	
		t.channel = 7;
		t.channelDown();
		System.out.println("���� ä���� " + t.channel + "�� �Դϴ�!");
	}
}

class Tv2 {
	//�Ӽ�(����)
	String color;
	boolean power;
	int channel;
	
	//���(�޼���)
	void power() { power = !power; }
	void channelUp() { channel++; }
	void channelDown() { channel--; }
}