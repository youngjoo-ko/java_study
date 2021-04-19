package control_statement;

public class _While2 {
	// 1부터 몇까지 더해야 100이 넘지 않는지 알아내는 예제
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0 , i =0;
		while(sum<=100) {
			System.out.printf("%d, %d%n", i, sum);
			++i;
			sum += i; // 두줄 합쳐서 sum += ++i; 로 바꿀수 있다 
			//System.out.printf("%d%n", sum);
		}
	}
}
