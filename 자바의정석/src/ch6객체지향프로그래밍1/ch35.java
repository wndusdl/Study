package ch6객체지향프로그래밍1;

public class ch35 {

	public static void main(String[] args) {
		Car c1 = new Car("white", "auto", 4);
		Car c2 = new Car("red", "auto", 4);
		
		System.out.println("c1의 color= " + c1.color + ", gearType= " + c1.gearType + ", door= " + c1.door);
		System.out.println("c2의 color= " + c2.color + ", gearType= " + c2.gearType + ", door= " + c2.door);
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {}	//기본 생성자(인스턴스 초기화)
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
}