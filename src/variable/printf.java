package variable;



public class printf {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d); // 소수점이하 6자리까지 반올림
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 이하 10자리(부족한 부분은 0으로 채움)
		System.out.printf("d=%014.10f%n", d); // 정수 앞부분을 0으로 채움
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // 우측정렬
		System.out.printf("[%-20s]%n", url); // 좌측정렬 
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
	}

}

