package OOP;

public class class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("카드 클래스의 클래스 변수 width = " + Card.width);
		System.out.println("카드 클래스의 클래스 변수 height = " + Card.height);
		
		Card c1 = new Card(); // 객체 생성
		c1.kind = "Spade"; // 인스턴스 변수 값 수정
		c1.number = 7;
		
		Card c2 = new Card(); // 객체 생성
		c2.kind = "Heart"; // 인스턴스 변수 값 수정
		c2.number = 4;
		
		Card.width = 50; // 클래스 변수 값 수정
		Card.height = 60; // c1, c2가 공유하는 변수이므로 c2도 수정됨.
		
		System.out.println("클래스 변수 width, height 값을 50, 60으로 변경합니다.");
		System.out.printf("c1의 무늬 = %s, 숫자 = %d, 너비= %d, 높이 = %d%n", c1.kind, c1.number, Card.width, Card.height);
		System.out.printf("c2의 무늬 = %s, 숫자 = %d, 너비= %d, 높이 = %d%n", c2.kind, c2.number, Card.width, Card.height);
	}

}

class Card{
	//인스턴스 변수 무늬와 숫자
	String kind;
	int number;
	// 클래스 변수 너비와 높이
	static int width =100;
	static int height = 250;
	
}
