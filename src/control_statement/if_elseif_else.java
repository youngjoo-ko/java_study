package control_statement;
import java.util.Scanner;

public class if_elseif_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' '; // 성적을 저장할 변수, 공백으로 초기화 
		System.out.print("점수를 입력하세요>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
		}
		else if(score>=80) {
			grade = 'B';
		}
		else if(score>=70) {
			grade = 'C';
		}
		else {
			grade = 'D';
		}
		System.out.println("당신의 성적은 " + grade + "입니다");
	}
}
