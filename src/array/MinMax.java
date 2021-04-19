package array;

public class MinMax {
	// 최대 최소값 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = {50, 60, 70, 80, 90};
		int min = score[0];
		int max = score[0]; // 순서대로 비교하기 위해 첫번째 요소로 초기화해줌
		
		for(int i=1; i<score.length; i++) {
			if(score[i] > max) {
				max = score[i];
			}
			else {
				min = score[i];
			}
		}
		System.out.printf("최대값=%d, 최소값=%d", max, min);
	}

}
