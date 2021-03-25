package control_statement;

public class q4_6 {
// 주사위 2개 던져서 합이 6이 될 경우의 수 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if(i+j==6) {
					System.out.printf("%d+%d=%d%n", i,j,i+j);
				}
			}
		}
	}
}
