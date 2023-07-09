package ch4클래스와객체;

public class ex8 {

	public static void main(String[] args) {
		Power robot = new Power();
		robot.set(10, 20);
	}
}

class Power {
	public int kick;
	public int punch;
	
	//생성자 사용
//	public Power(int kick, int punch) {
//		super();
//		this.kick = kick;
//		this.punch = punch;
//	}

	//메소드 사용
	public void set(int kick, int punch) {
		this.kick = kick;
		this.punch = punch;
	}
}