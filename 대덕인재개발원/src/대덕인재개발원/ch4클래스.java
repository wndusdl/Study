package 대덕인재개발원;

import java.util.Scanner;
/*
 * 1. 클래스의 3요소를 활용하여 Homework03클래스를 완성해주세요.
 * 
 * *** 변수명, 함수명은 본인이 자유롭게 작성해주세요.
 */
public class ch4클래스 {

	public static void main(String[] args) {
		// 26. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 기본 생성자를 이용해서 만들어주세요.
		Homework03 hw1 = new Homework03();
		
		// 27. 만들어진 Homework03 클래스 객체 변수를 이용해서 주소, 핸드폰번호, 이메일, 취미를 저장할 수 있는 함수를 이용해 값을 저장해주세요.
		hw1.setInfo1("송촌동", "010-1234-5678");
		hw1.setInfo2("abc123@naver.com", "등산");
		
		// 28. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 주소 값을 함수를 이용해서 출력해주세요.
		hw1.printinfo2();
		
		// 29. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 핸드폰번호 값을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================");
		hw1.printTel();
		
		// 30. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 이메일 값을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================");
		hw1.printEmail();
		
		// 31. 26번에서 만들어진 클래스 객체 변수를 이용해서 27번에서 넣었던 취미 값을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================");
		hw1.printHobby();
		
		// 32. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 이름,나이를 입력받아 만들 수 있는 생성자를 이용하여 객체를 만들어주세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		Homework03 hw2 = new Homework03(name, age);
		
		// 33. 만들어진  Homework03 클래스 객체 변수를 이용해서 성별을 저장할 수 있는 함수를 이용해 값을 저장해주세요.
		hw2.setgender("여자");
		
		// 34. 32번에서 만들어진 클래스 객체 변수를 이용해서 이름, 나이, 성별 값을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================");
		hw2.printinfo1();
				
		// 35. Homework03 클래스 객체를 인스턴스화 과정을 통해 인스턴스를 만들어주세요. (객체 생성)
		// 이때, 이름, 나이, 성별을 입력받아 만들 수 있는 생성자를 이용하여 객체를 만들어주세요.
		System.out.println("=======================================");
		System.out.print("이름 입력 >> ");
		name = sc.next();
		
		System.out.print("나이 입력 >> ");
		age = sc.nextInt();
		
		System.out.print("성별 입력 >> ");
		String gender = sc.next();
		
		Homework03 hw3 = new Homework03(name, age, gender);
				
		// 36. 만들어진 Homework03 클래스 객체 변수를 이용해서 이름, 나이, 성별 값을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================");
		hw3.printinfo1();
				
		// 37. 35번에서 만들어진 클래스 객체 변수를 이용해서 이름을 홍길동으로 변경해주세요. (이름에 새로운 이름으로 저장)
		hw3.setName("홍길동");
				
		// 38. 35번에서 만들어진 클래스 객체 변수를 이용해서 나이를 99로 변경해주세요. (나이에 새로운 나이로 저장)
		hw3.setAge(99);
				
		// 39. 35번에서 만들어진 클래스 객체 변수를 이용해서 성별을 반대 성별로 변경해주세요. (성별에 새로운 성별으로 저장)
		if(gender.equals("여자")) {
			hw3.setgender("남자");
		} else if(gender.equals("남자")) {
			hw3.setgender("여자");
		}
		
		// 40. 새롭게 변경된 이름, 나이, 성별을 함수를 이용해서 출력해주세요.
		System.out.println("=======================================\n[[ 새로운 정보 ]]");
		hw3.printinfo1();
	}
}

class Homework03 {
	// # 필드를 작성해주세요
	// 1. 이름을 저장할 변수를 만들어주세요.
	String name;
	// 2. 나이를 저장할 변수를 만들어주세요.
	int age;
	// 3. 성별을 저장할 변수를 만들어주세요.
	String gender;
	// 4. 주소를 저장할 변수를 만들어주세요.
	String address;
	// 5. 핸드폰번호를 저장할 변수를 만들어주세요.
	String tel;
	// 6. 이메일을 저장할 변수를 만들어주세요.
	String email;
	// 7. 취미를 저장할 변수를 만들어주세요.
	String hobby;
	
	// # 생성자를 작성해주세요
	// 8. 기본생성자를 만들어주세요.
	Homework03() {}

	// 9. 이름을 입력받을 수 있는 커스텀 생성자를 만들어주세요.
	// 그리고 입력받아온 이름을 초기화해주세요.
	public Homework03(String name) {
		this.name = name;
	}

	// 10. 이름, 나이를 입력받을 수 있는 커스텀 생성자를 만들어주세요.
	// 그리고 입력받아온 이름, 나이를 초기화해주세요.
	public Homework03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 11. 이름, 나이, 성별을 입력받을 수 있는 커스텀 생성자를 만들어주세요. 
	// 그리고 입력받아온 이름, 나이, 성별을 초기화해주세요.
	public Homework03(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}	
	
	// # 함수를 작성해주세요.
	// 12. 이름을 출력할 수 있는 함수를 만들어주세요.
	public void printName() {
		System.out.println("이름 : " + name);
	}
		
	// 13. 나이를 출력할 수 있는 함수를 만들어주세요.
	public void printAge() {
		System.out.println("나이 : " + age);
	}
		
	// 14. 성별을 출력할 수 있는 함수를 만들어주세요.
	public void printGender() {
		System.out.println("성별 : " + gender);
	}
		
	// 15. 주소를 출력할 수 있는 함수를 만들어주세요.
	public void printAddress() {
		System.out.println("주소 : " + address);
	}
		
	// 16. 핸드폰번호를 출력할 수 있는 함수를 만들어주세요.
	public void printTel() {
		System.out.println("나이 : " + tel);
	}
		
	// 17. 이메일을 출력할 수 있는 함수를 만들어주세요.
	public void printEmail() {
		System.out.println("이메일 : " + email);
	}
		
	// 18. 취미를 출력할 수 있는 함수를 만들어주세요.
	public void printHobby() {
		System.out.println("취미 : " + hobby);
	}
		
	// 19. 이름, 나이, 성별을 출력할 수 있는 함수를 만들어주세요.
	public void printinfo1() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
		
	// 20. 주소, 핸드폰번호, 이메일, 취미를 출력할 수 있는 함수를 만들어주세요.
	public void printinfo2() {
		System.out.println("주소 : " + address);
		System.out.println("핸드폰번호 : " + tel);
		System.out.println("이메일 : " + email);
		System.out.println("취미 : " + hobby);
	}
		
	// 21. 이름, 나이, 성별, 주소, 핸드폰번호, 이메일, 취미를 출력할 수 있는 함수를 만들어주세요.
	public void printinfo3() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("주소 : " + address);
		System.out.println("핸드폰번호 : " + tel);
		System.out.println("이메일 : " + email);
		System.out.println("취미 : " + hobby);
	}
		
	// 22. 주소를 전달받아서 전달받은 주소를 저장할 수 있는 함수를 만들어주세요.
	public void setAddress(String address) {
		this.address = address;
	}
		
	// 23. 핸드폰번호를 전달받아서 전달받은 핸드폰번호를 저장할 수 있는 함수를 만들어주세요.
	public void setTel(String tel) {
		this.tel = tel;
	}
		
	// 24. 이메일을 전달받아서 전달받은 이메일을 저장할 수 있는 함수를 만들어주세요.
	public void setEmail(String email) {
		this.email = email;
	}
		
	// 25. 취미를 전달받아서 전달받은 취미를 저장할 수 있는 함수를 만들어주세요.
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
		
	// 26. 주소, 핸드폰번호를 전달받아서 전달받은 주소, 핸드폰번호를 저장할 수 있는 함수를 만들어주세요.
	public void setInfo1(String address, String tel) {
		this.address = address;
		this.tel = tel;
	}
		
	// 27. 이메일, 취미를 전달받아서 전달받은 이메일, 취미를 저장할 수 있는 함수를 만들어주세요.
	public void setInfo2(String email, String hobby) {
		this.email = email;
		this.hobby = hobby;
	}
		
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
