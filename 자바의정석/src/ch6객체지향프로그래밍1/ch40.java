package ch6��ü�������α׷���1;

public class ch40 {
	static {
		System.out.println("static { }");
	}
	
	{
		System.out.println("{ }");
	}
	
	public ch40() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("ch40 ch = new ch40(); ");
		ch40 ch = new ch40();
		
		System.out.println("ch40 ch1 = new ch40(); ");
		ch40 ch1 = new ch40();
	}
}
