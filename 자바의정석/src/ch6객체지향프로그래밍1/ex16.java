package ch6��ü�������α׷���1;

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

