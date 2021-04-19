package operator;

public class Type_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a = 10;
		byte b = 30;
		// byte res = a + b; // 에러 , 왜? 산술변환에 의해서 a와 b 모두 int 타입으로 변환됐기 때문
		// 따라서, 명시적 형변환이 필요하다.
		byte res = (byte)(a + b);
		System.out.println(res);
		
		byte res2 = (byte)(a*b); // 300으로 byte의 범위를 넘는다. byte로 변환하면 44라는 값이 나옴.
		System.out.println(res2);
		
		int c = 1_000_000;
		int d = 2_000_000;
		
		long res3 = c * d;
		System.out.println(res3); 
		// 결과 -1454759936 왜? c*d의 타입은 int 이므로 오버플로우 발생한 후 long타입에 저장됐기 때문
		// 산술 변환이 될 수 있도록 변수하나를 long 타입으로 명시적 형변환 해준다.
		long res4 = (long)c * d;
		System.out.println(res4); 
	}
}
