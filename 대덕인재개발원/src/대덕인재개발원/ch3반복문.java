package ������簳�߿�;

import java.util.Scanner;

public class ch3�ݺ��� {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� 1, �ݺ����� �̿��Ͽ� ���� 1-10���� ������ּ���.
			for(int i=1; i<=10; i++) {
				System.out.println(i);
			}
			System.out.println("=========================");
			
		// ���� 2, �ݺ����� �̿��Ͽ� ���� 100-200���� ������ּ���.
			for(int i=100; i<=200; i++) {
				System.out.println(i);
			}
			System.out.println("=========================");
			
		// ���� 3, �ݺ����� �̿��Ͽ� ���� 10-25���� ������ּ���.
			for(int i=10; i<=25; i++) {
				System.out.println(i);
			}
			System.out.println("=========================");
		
		// ���� 4, �ݺ����� �̿��Ͽ� ���� 28-34���� ������ּ���.
			for(int i=28; i<=34; i++) {
				System.out.println(i);
			}
			System.out.println("=========================");
		
		// ���� 5, �ݺ����� �̿��Ͽ� ���� 506-608���� ������ּ���.
			for(int i=506; i<=608; i++) {
				System.out.println(i);
			}
			System.out.println("=========================");
		
		// ���� 6, �ݺ����� �̿��Ͽ� ���� 1-10�����ȿ��� ¦���� ������ּ���.
			for(int i=1; i<=10; i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
			System.out.println("=========================");
		
		// ���� 7, �ݺ����� �̿��Ͽ� ���� 1-10�����ȿ��� Ȧ���� ������ּ���.
			for(int i=1; i<=10; i++) {
				if(i%2==1) {
					System.out.println(i);
				}
			}
			System.out.println("=========================");
		
		// ���� 8, �ݺ����� �̿��Ͽ� ���� 100-200 �����ȿ��� 10�� ����� ������ּ���.
			for(int i=100; i<=200; i++) {
				if(i%10==0) {
					System.out.println(i);
				}
			}
			System.out.println("=========================");
		
		// ���� 9, �ݺ����� �̿��Ͽ� ���� 10-25 ���� �ȿ��� 5�� ����� ������ּ���.
			for(int i=10; i<=25; i++) {
				if(i%5==0) {
					System.out.println(i);
				}
			}
			System.out.println("=========================");
		
		// ���� 10, �ݺ����� �̿��Ͽ� ���� 28-34 ���� �ȿ��� 2�� ����� �ƴѰ͸� ������ּ���.
			for(int i=28; i<=34; i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
			}		
				System.out.println("=========================");
			
		// ���� 11, �ݺ����� �̿��Ͽ� ���� 506-608 ���� �ȿ��� 50�� ��� �ΰ͸� ����ϰ�, 50�� ����� ���ڰ� �� ����� ī��Ʈ�� ������ּ���.
				int count = 0;
				for(int i=506; i<=608; i++) {
					if(i%50==0) {
						System.out.println(i);
						count++;
						}
					}
				System.out.println("50�� ����� ���ڰ��� : " + count);
			System.out.println("=========================");
				
		// ���� 12, �ݺ����� �̿��Ͽ� ���� 1-10������ ���ڸ� ��� ���� ����� ������ּ���.
			int sum = 0;
			for(int i=1; i<=10; i++) {
				sum += i;
			}
			System.out.println(sum);
			System.out.println("=========================");
		
		// ���� 13, �ݺ����� �̿��Ͽ� ���� 1-10 �����ȿ��� Ȧ���鳢���� ��� ���� ����� ������ּ���.
			int sum1 = 0;
			for(int i=1; i<=10; i++) {
				if(i%2==1) {
					sum1 += i;
				}
			}
			System.out.println(sum1);
			System.out.println("=========================");
		
		// ���� 14, �ݺ����� �̿��Ͽ� ���� 100-200 �����ȿ��� 5�� ����� �ش��ϴ� ���ڵ鸸 ��� ���� ����� ������ּ���.
			int sum2 = 0;
			for(int i=100; i<=200; i++) {
				if(i%5==0) {
					sum2 += i;
				}
			}
			System.out.println(sum2);
			System.out.println("=========================");
			
		// ���� 15, �ݺ����� �̿��Ͽ� ���� 0-100 �����ȿ��� �Ʒ� �����϶� ������ ������ּ���.
		// 0���϶� ����!
		// 50���϶� �߰��� �߱���!
		// 70���϶� ���ݴ� �й�����!
		// 90���϶� ��� ���ݴ�!
		// 100���϶� ���� ���߾��!
			for(int i=0; i<=100; i++) {
				if(i==0) {
					System.out.println("0���϶� ����!");
				} else if(i==50) {
					System.out.println("50���϶� �߰��� �߱���!");
				} else if(i==70) {
					System.out.println("70���϶� ���ݴ� �й�����!");
				} else if(i==90) {
					System.out.println("90���϶� ��� ���ݴ�!");
				} else if(i==100) {
					System.out.println("100���϶� ���� ���߾��!");
				}
			}
			System.out.println("=========================");
		
//			for(int i=0; i<=100; i++) {
//				System.out.print("������ �Է��ϼ���! >> ");
//				int score = sc.nextInt();
//				if(i==0) {
//					System.out.println("0���϶� ����!");
//					break;
//				} else if(i==50) {
//					System.out.println("50���϶� �߰��� �߱���!");
//					break;
//				} else if(i==70) {
//					System.out.println("70���϶� ���ݴ� �й�����!");
//					break;
//				} else if(i==90) {
//					System.out.println("90���϶� ��� ���ݴ�!");
//					break;
//				} else if(i==100) {
//					System.out.println("100���϶� ���� ���߾��!");
//					break;
//				} else {
//					System.out.println("�й��ϼ���!");
//					break;
//				}
//			}
		// ���� 16, ������ ���� a = 0�� ���� �� �ʱ�ȭ�ϰ�, �ݺ��� while�� �̿��Ͽ� ���� a�� 1�� �����ϰ� a�� 10���� Ŭ������ a�� ������ּ���.
		// ��, a�� 10���� Ŭ�� �ݺ����� �������ּ���.
			int a = 0;
			
			while (true) {
				System.out.println(a);
				a++;
				
				if(a>10) break;
			}
			System.out.println("=========================");
		
		// ���� 17, ������ ���� b = 10�� ���� �� �ʱ�ȭ�ϰ�, �ݺ��� while�� �̿��Ͽ� ���� b�� 1�� �����ϰ� b�� 20���� Ŭ������ b�� ������ּ���.
		// ��, b�� ¦���϶� '¦��(����) : ¦���Դϴ�'�� ������ּ���. 
		// b�� 20���� Ŭ�� �ݺ����� �������ּ���.
		     int b = 10;
		        while (b <= 20) {
		            if (b % 2 == 0) {
		                System.out.println("¦��(" + b + "): ¦���Դϴ�");
		            } else {
		                System.out.println(b);
		            }
		            b++;
		        }
		        System.out.println("=========================");
		
		// ���� 18, ������ ���� c = 0�� ���� �� �ʱ�ȭ�ϰ�, �ݺ��� while�� �̿��Ͽ� ���� c�� 10�� �����ϰ� c�� 100���� Ŭ������ c�� ������ּ���.
		// ��, c�� 100�϶� '100%�Դϴ�'�� ������ֽð� �ݺ����� �������ּ���.
			int c = 0;
			while(c<=100) {
				System.out.println(c);
				if(c==100) {
					System.out.println("100%�Դϴ�.");
				}
				c+=10;
			}
			System.out.println("=========================");
		
		// ���� 19, �ݺ��� while�� �̿��Ͽ� ���ڸ� ���ѹݺ����� �Է¹޾��ּ���.
		// ���� 1�� �Է¹ްԵǸ� '�α���'�̶�� ���ڸ� ������ּ���.
		// ���� 2�� �Է¹ްԵǸ� '�α׾ƿ�'�̶�� ���ڸ� ������ּ���.
		// ���� 3�� �Է¹ްԵǸ� '����'��� ���ڸ� ������ֽð�, �ݺ����� �������ּ���.
//			while (true) {
//				System.out.print("���� �Է� >> ");
//				int num = sc.nextInt();
//				switch (num) {
//				case 1:
//					System.out.println("�α���");
//					break;
//				case 2:
//					System.out.println("�α׾ƿ�");
//					break;
//				case 3:
//					System.out.println("����");
//					return;
//				}
//			}
		
		// ���� 20, �ݺ��� while�� �̿��Ͽ� ���ڸ� ���ѹݺ����� �Է¹޾��ּ���.
		// ���� '�α���'�� �Է��ϸ�, '�α��� ��ư�� Ŭ���Ͽ����ϴ�'�� ����ϰ�
		// ���� '�α׾ƿ�'�� �Է��ϸ�, '�α׾ƿ� ��ư�� Ŭ���Ͽ����ϴ�'�� ����ϰ�
		// ���� '����'�� �Է��ϸ�, '�ý����� �����մϴ�'�� ����ϰ� ���Ḧ �Է��� ��� �ݺ����� �������ּ���.
			while (true) {
				System.out.print("���ڸ� �Է��ϼ���! >> ");
				String str = sc.nextLine();
				if(str.equals("�α���")) {
					System.out.println("�α��� ��ư�� Ŭ���Ͽ����ϴ�");
				} else if(str.equals("�α׾ƿ�")) {
					System.out.println("�α׾ƿ� ��ư�� Ŭ���Ͽ����ϴ�");
				} else if(str.equals("����")) {
					System.out.println("�ý����� �����մϴ�");
					return;
				}
			}
		}
}