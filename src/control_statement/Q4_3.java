package control_statement;

public class Q4_3 {
 //1+(1+2)...(1+2+..+10) 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++) {
				sum += j;
			}
		}
		System.out.printf("총합=%d%n", sum);
	}
}
