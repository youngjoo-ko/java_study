package array;

public class Q5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr_q = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		
		int total = 0;
		float average = 0f;
		
		for(int i=0; i<arr_q.length; i++) {
			for(int j=0; j<arr_q[i].length; j++) {
				total += arr_q[i][j];
			}
		}
		average = total / (float)(arr_q.length * arr_q[0].length); 
		System.out.printf("총합=%d, 평균=%.2f" , total, average);
	}

}
