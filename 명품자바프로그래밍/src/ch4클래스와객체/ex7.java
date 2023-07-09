package ch4클래스와객체;

public class ex7 {

	public static void main(String[] args) {
		Person aPerson = new Person();
		aPerson.setAge(17);
	}
}

class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}