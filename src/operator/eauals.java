package operator;

public class eauals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = new String("abc");
		// str1 과 2는 내용이 같다.
		System.out.printf("%b%n", str1 == str2); // 하지만 false 왜? 서로 다른 객체라서!
		// 내용이 같은지 확인하기 위해 equals 메서드를 사용한다.
		System.out.printf("%b%n", str1.equals(str2));
	}
}
