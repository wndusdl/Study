package ch4Ŭ�����Ͱ�ü;

public class q3 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "������");
		s.show();
	}
}

class Song {
	private String title;
	private String artist;
	private int year;
	private String contry;
	
	Song() {
		this("?", "?", 0, "?");
	}

	Song(String title, String artist, int year, String contry) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.contry = contry;
	}
	
	void show() {
		System.out.println(year + "�� " + contry + "������ " + artist + "�� �θ� " + title);
	}
}