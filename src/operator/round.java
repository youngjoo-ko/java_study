package operator;

public class round {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 소수점 n번째까지 반올림하기
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0; // 10의 3승 곱해주기 (10의 n승)
		System.out.println(shortPi);
		// double 타입의 결과를 얻기 위해 1000.0 으로 나눠줘야 한다.
	}
}
