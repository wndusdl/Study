package ch6객체지향프로그래밍1;

public class ex16 {
	
	public static void change(String str) {
		str += "456";
	}

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println(str);
		change(str);
		System.out.println("Afer change : " + str);
		
	}
}

