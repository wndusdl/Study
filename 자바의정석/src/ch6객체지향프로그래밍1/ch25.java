package ch6��ü�������α׷���1;

public class ch25 {

	public static void main(String[] args) {
		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		Data3 tmp = new Data3();	//���ο� ��ü tmp�� ����
		
		tmp.x = d.x;	//d.x�� ���� tmp.x�� ����
		
		return tmp;		//������ ��ü�� �ּҸ� ��ȯ�Ѵ�.
	}
}

class Data3 { int x; }
