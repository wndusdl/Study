package ch4Ŭ�����Ͱ�ü;

public class q1 {

	public static void main(String[] args) {
		TV1 myTV = new TV1("LG", 2017, 32);
		myTV.show();
	}
}

class TV1{
	private String maker;
	private int year;
	private int size;
	
	public TV1(String maker, int year, int size) {
		this.maker = maker;
		this.year = year;
		this.size = size;
	}
	
	public void show() {
		System.out.println(maker + "���� ���� " + year + "���� " + size + "��ġ TV");
	}
}
