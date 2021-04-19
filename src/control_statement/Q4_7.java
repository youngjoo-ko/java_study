package control_statement;

public class Q4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			/*char tmp = str.charAt(i);
			int num = (int)tmp - 48;
			sum += num; */
			sum += str.charAt(i) - '0'; // 간단하게 가능
			//System.out.printf("%d%n", num);
		}
		System.out.printf("총합 = %d%n", sum);
	}
}
