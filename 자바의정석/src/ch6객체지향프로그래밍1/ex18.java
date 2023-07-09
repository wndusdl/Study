package ch6��ü�������α׷���1;

public class ex18 {

	public static boolean isNumber(String str) {
		//str�� null�̰ų� ��������� false ��ȯ
		if(str==null || str.equals("")) 
			return false;
		
		for(int i=0; i<str.length(); i++) {
			//�ݺ����� ����ؼ� �� ���ھ� ���ʴ�� �о�� charŸ���� ch������ �����Ѵ�.
			char ch = str.charAt(i);
			
			//�о�� ���ڰ� ���ڰ� �ƴ϶�� false ��ȯ
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "�� �����Դϱ�? " + isNumber(str));
		
	}
}
