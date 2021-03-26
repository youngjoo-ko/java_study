package array;

public class array5_5_lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[45]; // 45개 정수를 저장할 배열 생성
		
		// 각 요소에 1~45 저장
		for(int i=0; i<lotto.length; i++) {
			lotto[i] += i+1; //1~45까지 저장
		}
		
		int tmp = 0; //두값을 바꾸기 위한 임시변수
		int j = 0; //임의의 값 저장할 변수
		
		// 배열의 i번째 요소와 임의의 요소에 저장된 값을 서로 바꿔서 값을 섞는다
		// 0~5번째 요소까지 6개만 바꾼다
		for(int i=0; i<6; i++) {
			j = (int)(Math.random() * 45 + 1); //1~45까지 임의의 수 얻음
			tmp = lotto[i];
			lotto[i] = lotto[j];
			lotto[j] = tmp;
		}
		
		// 로또번호 45개 중 앞 6개만 출력
		for(int i=0; i<6; i++) {
			System.out.printf("%d " , lotto[i]);
		}
	}

}
