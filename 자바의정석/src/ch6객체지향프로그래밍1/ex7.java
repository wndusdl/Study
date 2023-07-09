package ch6객체지향프로그래밍1;

public class ex7 {

	public static void main(String[] args) {
		
	}
}

class Marine{
	//인스턴스 변수
	int x = 0, y = 0;				//Marine의 위치좌표(x,y)
	int hp = 60;					//현재 체력
	
	//static 변수, 모든 병사의 공격력과 방어력이 동일해야 하므로
	static int weapon = 6;			//공격력
	static int armor = 0;			//방어력
	
	//staic 변수 작업을 하기 위해서
	static void weaponUp() {
		weapon++;
	}
	
	//staic 변수 작업을 하기 위해서
	static void armorUp() {
		armor++;
	}
	
	//지역변수
	void move(int x, int y) {
		this.x = x;				//앞 x는 인스턴스 변수, 뒤에 x는 지역변수
		this.y = y;				//앞 y는 인스턴스 변수, 뒤에 y는 지역변수
	}
}