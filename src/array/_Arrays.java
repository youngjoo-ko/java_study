package array;
import java.util.Arrays;

public class _Arrays {

	public static void main(String[] args) {
		
		int[][] arr2d = {{1,2},{3,4}};
		System.out.println(Arrays.deepToString(arr2d)); // 결과 [[1, 2], [3, 4]]
		
		int[] arr_1 = {0,1,2,3,4};
		int[] arr_2 = Arrays.copyOf(arr_1, 5);
		int[] arr_3 = Arrays.copyOf(arr_1, 3);
		int[] arr_4 = Arrays.copyOf(arr_1, 10);
		int[] arr_5 = Arrays.copyOfRange(arr_1, 1, 4);
		
		System.out.println(Arrays.toString(arr_2));
		System.out.println(Arrays.toString(arr_3));
		System.out.println(Arrays.toString(arr_4));
		System.out.println(Arrays.toString(arr_5));
		
		//결과
		/*
		[0, 1, 2, 3, 4]
		[0, 1, 2]
		[0, 1, 2, 3, 4, 0, 0, 0, 0, 0]
		[1, 2, 3]

		 */
		int[] arr_6 = {3,4,2,1,6};
		Arrays.sort(arr_6);
		System.out.println(Arrays.toString(arr_6));
	}

}
