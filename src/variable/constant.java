package variable;

public class constant{
	public static void main(String[] args) {
		final int SCORE = 100;
		// score = 200; 에러, 상수이므로
		boolean power = true;
		byte b = 127; //(-128~127)
		
		int oct = 010; // 8진수, 10진수로 8
		int hex = 0x10; // 16진수, 10진수로 16
		System.out.println(oct);
		System.out.println(hex);
		
		long l = 1000_000_000; // int형 리터럴 10억, 만약 100억으로 바꾼다면
		// 접미사 L을 붙여야 가능 
		long L = 10_000_000_000l; 
		System.out.println(l);
		System.out.println(L);
		
		float f = 3.14f;
		double d = 3.14d;
		double dd = 3.14f; // 변수 > 리터럴이므로 에러없음
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}
}

