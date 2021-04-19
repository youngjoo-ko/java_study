package control_statement;
import java.util.*;

public class _While3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0, num=0;
		System.out.print("숫자를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		//String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
		//num = Integer.parseInt(tmp);  // 입력받은 문자열 tmp를 숫자로 변환
		
		while(num!=0) {
			sum += num%10;
			System.out.printf("sum=%d num=%d%n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리수합=" + sum);
	}

}

