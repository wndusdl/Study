package ch6��ü�������α׷���1;

public class ex2 {

		public static void main(String args[]) {
			Student2 s = new Student2("ȫ�浿", 1 ,1 ,100, 60, 76); 
			String str = s.info();
			System.out.println(str);
	}
}
			
class Student2 {
			
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
			
	Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
		
	public String info() {
		return name
		+","+ban
		+","+no
		+","+kor
		+","+eng
		+","+math
		+","+(kor+eng+math)
		+","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f);
	}
}
