package ch6��ü�������α׷���1;

public class ex21 {

	public static int abs(int value) {
		//value�� ���� ����̸� �״�� ��ȯ, �����̸� ��ȣ�� �ٲ㼭 ��ȯ
		return value>=0 ? value : -value;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value + "�� ���밪: " + abs(value));
		
		value = -10;
		System.out.println(value + "�� ���밪: " + abs(value));
	}
}
