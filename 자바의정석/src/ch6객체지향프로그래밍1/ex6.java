package ch6��ü�������α׷���1;

public class ex6 {

	public static void main(String[] args) {
		//�ν��Ͻ� �޼��� ����
		MyPoint p = new MyPoint(1, 1);
		System.out.println(p.getDistance(2, 2));
		
		//static �޼��� ����
//		System.out.println(Exercise6_6.getDistance(1,1,2,2));
	}
}

class MyPoint {
	//�ν��Ͻ� ����
	int x;
	int y;
	
	//������
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�ν��Ͻ� �޼���
	//�ν��Ͻ� ����(x,y)�� ������ �Ű������� x1, y1�� ���������� ��
	//�ν��Ͻ��� ���������� static ��� �Ұ���
	 double getDistance(int x1, int y1) {
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
}