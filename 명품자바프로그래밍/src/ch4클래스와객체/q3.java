package ch4클래스와객체;

public class q3 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
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
		System.out.println(year + "년 " + contry + "국적의 " + artist + "가 부른 " + title);
	}
}