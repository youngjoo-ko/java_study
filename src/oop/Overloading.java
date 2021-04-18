package oop;

public class Overloading {

	public static void main(String[] args) {
		System.out.println(MyMath3.add(3,5)); //8
		System.out.println(MyMath3.add(3f,5)); //8.0
		System.out.println(MyMath3.add(3L,5L)); //8
		
		int[] arr = {1,2,3,4,5};
		System.out.println(MyMath3.add(arr)); //15

	}

}

class MyMath3 {
	static int add(int a, int b) {return a+b;}
	static float add(float a, int b) {return a+b;}
	static long add(long a, long b) {return a+b;}
	static int add(int[] arr) {
		int res = 0;
		for(int i=0; i<arr.length; i++) {
			res += arr[i];
		}
		return res;
	}
}
