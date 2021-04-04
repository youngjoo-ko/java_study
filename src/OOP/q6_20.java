package OOP;

public class q6_20 {
	static int max(int[] arr) {
		int maxnum = -999999;
		if(arr == null || arr.length == 0) {
			return -999999;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(maxnum < arr[i]) {
				maxnum = arr[i];
			}
		}
		return maxnum;
		
	}
	
	public static void main(String[] args) {
		int[] data = {1,3,5,7,9};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println(max(data));
		System.out.println(max(null));
		System.out.println(max(new int[] {}));

	}

}
