package control_statement;

//1~20 정수중에서 2 또는 3의 배수가 아닌 수의 총합 구하기
public class Q4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=1; i<=20; i++) {
			if((i%2 != 0) && (i%3 != 0)) {
				sum +=i;
			}
		}
		System.out.printf("2와 3의 배수가 아닌 수의 총합 = %d%n", sum);
	}
}

