package ch6��ü�������α׷���1;

public class ch10 {

	public static void main(String[] args) {
		
	}
}

class Time {
	private int hour;
	private int minute;
	private float second;
	
	//hour�� ���� �����ϱ� ���� �޼���, ������ ���� 0���� �۰ų� 23���� ũ��
	//��, ��ȿ�� ���� �ƴϸ� �������� �ʰ� �޼��带 ����(return)�Ѵ�.
	public void setHour(int h) {
		if(h<0 || h>23) return;
		hour = h;	//������ ��(h)�� ��ȿ�� ��쿡�� hour�� ����
	}
}
