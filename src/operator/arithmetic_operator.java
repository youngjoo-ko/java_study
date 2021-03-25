package operator;

public class arithmetic_operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 4;
		// 혹은 
		//float b = 4.0f;
		//System.out.printf("%d / %f = %f%n", a,b,a/b);
		System.out.printf("%d / %d = %d%n", a,b,a/b);
		System.out.printf("%d / %.1f = %.1f%n", a, (float)b ,a / (float)b);
	}
}
