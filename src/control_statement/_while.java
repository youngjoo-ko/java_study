package control_statement;

public class _while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		while(i--!=0) {
			System.out.println(i + " hello");
			// 조건식 i!=0 로 바꾸고, 증감식 i--; 를 추가해도 가능
		}
	}
}
/*결과 : 조건식에서 5, println메서드로 들어갔을땐 4가 되므로 4부터 출력됨*/

