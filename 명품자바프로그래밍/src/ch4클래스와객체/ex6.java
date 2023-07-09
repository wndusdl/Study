package ch4클래스와객체;

public class ex6 {

	public static void main(String[] args) {
		
	}
}

class Tv {
	private int size;
	private String manufacturer;
	
	public Tv() {
		this(32, "LG");
		System.out.println(size + "인치 " + manufacturer);
	}
	
	public Tv(String manufacturer) {
		this(32, manufacturer);
		System.out.println(size + "인치 " + manufacturer);
	}
	
	public Tv(int size, String manufacturer) {
		this.size = size;
		this.manufacturer = manufacturer;
		System.out.println(size + "인치 " + manufacturer);
	}
}