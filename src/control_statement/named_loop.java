package control_statement;

public class named_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(i==5) {
					break Loop1; //5단 전까지만 출력
					//break; //5단만 제외하고 나머지 구구단 출력
					//continue; //5단만 제외하고 나머지 구구단 출력
				}
				System.out.printf("%d*%d=%d%n", i,j,i*j);
			} 
			System.out.println(); // 단 사이 공백
		} // end of Loop1
		
	}
}
