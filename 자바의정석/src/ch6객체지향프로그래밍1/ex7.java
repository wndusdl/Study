package ch6��ü�������α׷���1;

public class ex7 {

	public static void main(String[] args) {
		
	}
}

class Marine{
	//�ν��Ͻ� ����
	int x = 0, y = 0;				//Marine�� ��ġ��ǥ(x,y)
	int hp = 60;					//���� ü��
	
	//static ����, ��� ������ ���ݷ°� ������ �����ؾ� �ϹǷ�
	static int weapon = 6;			//���ݷ�
	static int armor = 0;			//����
	
	//staic ���� �۾��� �ϱ� ���ؼ�
	static void weaponUp() {
		weapon++;
	}
	
	//staic ���� �۾��� �ϱ� ���ؼ�
	static void armorUp() {
		armor++;
	}
	
	//��������
	void move(int x, int y) {
		this.x = x;				//�� x�� �ν��Ͻ� ����, �ڿ� x�� ��������
		this.y = y;				//�� y�� �ν��Ͻ� ����, �ڿ� y�� ��������
	}
}