package ch6��ü�������α׷���1;

//�� ���� �Ÿ��� ����ϴ� getDistance()�� �ϼ��Ͻÿ�.

public class ex4 {

	public static void main(String[] args) {
		System.out.println(ex6_4.getDistance(1, 1, 2, 2));
	}
}

class ex6_4{
	
	static double getDistance(int x, int y, int x1, int y1) {
		return Math.sqrt((x-x-1)*(x-x1)+(y-y1)*(y-y1));
	}
}
