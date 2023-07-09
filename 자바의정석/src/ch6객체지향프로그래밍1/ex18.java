package ch6객체지향프로그래밍1;

public class ex18 {

	public static boolean isNumber(String str) {
		//str이 null이거나 비어있으면 false 반환
		if(str==null || str.equals("")) 
			return false;
		
		for(int i=0; i<str.length(); i++) {
			//반복문을 사용해서 한 문자씩 차례대로 읽어와 char타입의 ch변수에 저장한다.
			char ch = str.charAt(i);
			
			//읽어온 문자가 숫자가 아니라면 false 반환
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
	}
}
