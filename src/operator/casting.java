package operator;

public class casting {
	public static void main(String[] args) {
		double d = 85.5;
		int score = (int)d;
		System.out.println("score=" + score); // 반올림 86
		System.out.println("d=" + d); // 85.5 변수 d는 변함없음
	}
}