package OOP;

/*Math.random ()
 Math.Random() 반환타입은 double이고, 반환값은 0.0~0.9사이이다.
Math.Random() 값에 10을 곱하면 0.0~9.9가 될 것이고, int로 강제형변환을 하면 0~9값이 나온다.
하지만 값을 1~10으로 변경해야함으로 전체에 +1씩 더해주면 값은 1~10이 나오게된다.
*/

public class q6_17 {
	
	static int[] shuffle(int[] arr) {
		// 배열의 요소가 없을때 원본 배열 그대로 반환
		if(arr==null || arr.length==0) { return arr;}
		
		for(int i=0; i<arr.length; i++) {
			int n = (int)(Math.random() * 9) + 1; //1~9 난수생성
			
			// 서로 바꿈
			int tmp = arr[0];
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
		
	}

}
