package control_statement;

public class q4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1, sum=0;
		while(sum<100) {
			if(num%2 != 0) {
				sum += num;
			}
			else if(num%2 ==0){
				sum -= num;
			}
			System.out.printf("%d, %d%n", num, sum);
			num++;
		}
	}

}
