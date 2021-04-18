package oop;

public class Init {
	static int[] arr = new int[10];
	
	static {
		for(int i=0; i<arr.length; i++) {
			// 1~10 중 임의의 수 저장
			arr[i] = (int)(Math.random() * 10 + 1); 
		}
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
