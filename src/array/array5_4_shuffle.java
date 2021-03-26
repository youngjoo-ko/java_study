package array;
import java.util.Arrays;

public class array5_4_shuffle {
	// 배열 요소 랜덤으로 섞기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random() * 10);//0~9까지 임의의 수 얻음
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}

}
