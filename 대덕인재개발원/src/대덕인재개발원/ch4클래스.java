package ������簳�߿�;

import java.util.Scanner;
/*
 * 1. Ŭ������ 3��Ҹ� Ȱ���Ͽ� Homework03Ŭ������ �ϼ����ּ���.
 * 
 * *** ������, �Լ����� ������ �����Ӱ� �ۼ����ּ���.
 */
public class ch4Ŭ���� {

	public static void main(String[] args) {
		// 26. Homework03 Ŭ���� ��ü�� �ν��Ͻ�ȭ ������ ���� �ν��Ͻ��� ������ּ���. (��ü ����)
		// �̶�, �⺻ �����ڸ� �̿��ؼ� ������ּ���.
		Homework03 hw1 = new Homework03();
		
		// 27. ������� Homework03 Ŭ���� ��ü ������ �̿��ؼ� �ּ�, �ڵ�����ȣ, �̸���, ��̸� ������ �� �ִ� �Լ��� �̿��� ���� �������ּ���.
		hw1.setInfo1("���̵�", "010-1234-5678");
		hw1.setInfo2("abc123@naver.com", "���");
		
		// 28. 26������ ������� Ŭ���� ��ü ������ �̿��ؼ� 27������ �־��� �ּ� ���� �Լ��� �̿��ؼ� ������ּ���.
		hw1.printinfo2();
		
		// 29. 26������ ������� Ŭ���� ��ü ������ �̿��ؼ� 27������ �־��� �ڵ�����ȣ ���� �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================");
		hw1.printTel();
		
		// 30. 26������ ������� Ŭ���� ��ü ������ �̿��ؼ� 27������ �־��� �̸��� ���� �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================");
		hw1.printEmail();
		
		// 31. 26������ ������� Ŭ���� ��ü ������ �̿��ؼ� 27������ �־��� ��� ���� �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================");
		hw1.printHobby();
		
		// 32. Homework03 Ŭ���� ��ü�� �ν��Ͻ�ȭ ������ ���� �ν��Ͻ��� ������ּ���. (��ü ����)
		// �̶�, �̸�,���̸� �Է¹޾� ���� �� �ִ� �����ڸ� �̿��Ͽ� ��ü�� ������ּ���.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		
		System.out.print("���� �Է� >> ");
		int age = sc.nextInt();
		
		Homework03 hw2 = new Homework03(name, age);
		
		// 33. �������  Homework03 Ŭ���� ��ü ������ �̿��ؼ� ������ ������ �� �ִ� �Լ��� �̿��� ���� �������ּ���.
		hw2.setgender("����");
		
		// 34. 32������ ������� Ŭ���� ��ü ������ �̿��ؼ� �̸�, ����, ���� ���� �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================");
		hw2.printinfo1();
				
		// 35. Homework03 Ŭ���� ��ü�� �ν��Ͻ�ȭ ������ ���� �ν��Ͻ��� ������ּ���. (��ü ����)
		// �̶�, �̸�, ����, ������ �Է¹޾� ���� �� �ִ� �����ڸ� �̿��Ͽ� ��ü�� ������ּ���.
		System.out.println("=======================================");
		System.out.print("�̸� �Է� >> ");
		name = sc.next();
		
		System.out.print("���� �Է� >> ");
		age = sc.nextInt();
		
		System.out.print("���� �Է� >> ");
		String gender = sc.next();
		
		Homework03 hw3 = new Homework03(name, age, gender);
				
		// 36. ������� Homework03 Ŭ���� ��ü ������ �̿��ؼ� �̸�, ����, ���� ���� �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================");
		hw3.printinfo1();
				
		// 37. 35������ ������� Ŭ���� ��ü ������ �̿��ؼ� �̸��� ȫ�浿���� �������ּ���. (�̸��� ���ο� �̸����� ����)
		hw3.setName("ȫ�浿");
				
		// 38. 35������ ������� Ŭ���� ��ü ������ �̿��ؼ� ���̸� 99�� �������ּ���. (���̿� ���ο� ���̷� ����)
		hw3.setAge(99);
				
		// 39. 35������ ������� Ŭ���� ��ü ������ �̿��ؼ� ������ �ݴ� ������ �������ּ���. (������ ���ο� �������� ����)
		if(gender.equals("����")) {
			hw3.setgender("����");
		} else if(gender.equals("����")) {
			hw3.setgender("����");
		}
		
		// 40. ���Ӱ� ����� �̸�, ����, ������ �Լ��� �̿��ؼ� ������ּ���.
		System.out.println("=======================================\n[[ ���ο� ���� ]]");
		hw3.printinfo1();
	}
}

class Homework03 {
	// # �ʵ带 �ۼ����ּ���
	// 1. �̸��� ������ ������ ������ּ���.
	String name;
	// 2. ���̸� ������ ������ ������ּ���.
	int age;
	// 3. ������ ������ ������ ������ּ���.
	String gender;
	// 4. �ּҸ� ������ ������ ������ּ���.
	String address;
	// 5. �ڵ�����ȣ�� ������ ������ ������ּ���.
	String tel;
	// 6. �̸����� ������ ������ ������ּ���.
	String email;
	// 7. ��̸� ������ ������ ������ּ���.
	String hobby;
	
	// # �����ڸ� �ۼ����ּ���
	// 8. �⺻�����ڸ� ������ּ���.
	Homework03() {}

	// 9. �̸��� �Է¹��� �� �ִ� Ŀ���� �����ڸ� ������ּ���.
	// �׸��� �Է¹޾ƿ� �̸��� �ʱ�ȭ���ּ���.
	public Homework03(String name) {
		this.name = name;
	}

	// 10. �̸�, ���̸� �Է¹��� �� �ִ� Ŀ���� �����ڸ� ������ּ���.
	// �׸��� �Է¹޾ƿ� �̸�, ���̸� �ʱ�ȭ���ּ���.
	public Homework03(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 11. �̸�, ����, ������ �Է¹��� �� �ִ� Ŀ���� �����ڸ� ������ּ���. 
	// �׸��� �Է¹޾ƿ� �̸�, ����, ������ �ʱ�ȭ���ּ���.
	public Homework03(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}	
	
	// # �Լ��� �ۼ����ּ���.
	// 12. �̸��� ����� �� �ִ� �Լ��� ������ּ���.
	public void printName() {
		System.out.println("�̸� : " + name);
	}
		
	// 13. ���̸� ����� �� �ִ� �Լ��� ������ּ���.
	public void printAge() {
		System.out.println("���� : " + age);
	}
		
	// 14. ������ ����� �� �ִ� �Լ��� ������ּ���.
	public void printGender() {
		System.out.println("���� : " + gender);
	}
		
	// 15. �ּҸ� ����� �� �ִ� �Լ��� ������ּ���.
	public void printAddress() {
		System.out.println("�ּ� : " + address);
	}
		
	// 16. �ڵ�����ȣ�� ����� �� �ִ� �Լ��� ������ּ���.
	public void printTel() {
		System.out.println("���� : " + tel);
	}
		
	// 17. �̸����� ����� �� �ִ� �Լ��� ������ּ���.
	public void printEmail() {
		System.out.println("�̸��� : " + email);
	}
		
	// 18. ��̸� ����� �� �ִ� �Լ��� ������ּ���.
	public void printHobby() {
		System.out.println("��� : " + hobby);
	}
		
	// 19. �̸�, ����, ������ ����� �� �ִ� �Լ��� ������ּ���.
	public void printinfo1() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
	}
		
	// 20. �ּ�, �ڵ�����ȣ, �̸���, ��̸� ����� �� �ִ� �Լ��� ������ּ���.
	public void printinfo2() {
		System.out.println("�ּ� : " + address);
		System.out.println("�ڵ�����ȣ : " + tel);
		System.out.println("�̸��� : " + email);
		System.out.println("��� : " + hobby);
	}
		
	// 21. �̸�, ����, ����, �ּ�, �ڵ�����ȣ, �̸���, ��̸� ����� �� �ִ� �Լ��� ������ּ���.
	public void printinfo3() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
		System.out.println("�ּ� : " + address);
		System.out.println("�ڵ�����ȣ : " + tel);
		System.out.println("�̸��� : " + email);
		System.out.println("��� : " + hobby);
	}
		
	// 22. �ּҸ� ���޹޾Ƽ� ���޹��� �ּҸ� ������ �� �ִ� �Լ��� ������ּ���.
	public void setAddress(String address) {
		this.address = address;
	}
		
	// 23. �ڵ�����ȣ�� ���޹޾Ƽ� ���޹��� �ڵ�����ȣ�� ������ �� �ִ� �Լ��� ������ּ���.
	public void setTel(String tel) {
		this.tel = tel;
	}
		
	// 24. �̸����� ���޹޾Ƽ� ���޹��� �̸����� ������ �� �ִ� �Լ��� ������ּ���.
	public void setEmail(String email) {
		this.email = email;
	}
		
	// 25. ��̸� ���޹޾Ƽ� ���޹��� ��̸� ������ �� �ִ� �Լ��� ������ּ���.
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
		
	// 26. �ּ�, �ڵ�����ȣ�� ���޹޾Ƽ� ���޹��� �ּ�, �ڵ�����ȣ�� ������ �� �ִ� �Լ��� ������ּ���.
	public void setInfo1(String address, String tel) {
		this.address = address;
		this.tel = tel;
	}
		
	// 27. �̸���, ��̸� ���޹޾Ƽ� ���޹��� �̸���, ��̸� ������ �� �ִ� �Լ��� ������ּ���.
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
