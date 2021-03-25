package control_statement;
import java.util.*;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0, num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(1) log");
			System.out.print("메뉴를 선택하세요(종료는 0)>");
			
			String tmp = scanner.nextLine(); 
			menu = Integer.parseInt(tmp);
			// menu = scanner.nextInt();
			
			if (menu == 0) {
				System.out.println("종료합니다.");
				break;
			} else if (!(1<=menu && menu <=3)) {
				System.out.println("잘못입력하셨습니다.");
				continue;
			}
			System.out.printf("선택하신 메뉴는 %d번 입니다.%n", menu);
		}
	}
}
