package ch4Ŭ�����Ͱ�ü;

public class ex8 {

	public static void main(String[] args) {
		Power robot = new Power();
		robot.set(10, 20);
	}
}

class Power {
	public int kick;
	public int punch;
	
	//������ ���
//	public Power(int kick, int punch) {
//		super();
//		this.kick = kick;
//		this.punch = punch;
//	}

	//�޼ҵ� ���
	public void set(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}
}