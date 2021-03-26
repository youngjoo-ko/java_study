package array;

public class array5_2_sum_average {

	public static void main(String[] args) {
		int sum = 0;
		float average = 0f;
		
		int score[] = {100, 88, 100, 100, 90};
		
		// 반복문으로 요소들 더하기
		for(int i=0; i<5; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;
		System.out.println("총합 = " + sum);
		System.out.println("평균 = " + average);
		
	}

}
