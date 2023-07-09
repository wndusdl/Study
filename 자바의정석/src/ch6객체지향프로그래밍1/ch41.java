package ch6객체지향프로그래밍1;

public class ch41 {
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++)
			System.out.println("arr[" +i+ "] : " + arr[i]);
	}
}
