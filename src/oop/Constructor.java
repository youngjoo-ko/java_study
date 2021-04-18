package oop;

class Car{
	String color; // 색상
	String gearType; // 변속기 종류- auto, manual
	int door; // 문의 개수
	
	Car() {} // 기본생성자 명시
	
	// 매개변수가 있는 생성자
	Car(String c , String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
}

public class Constructor {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("red", "auto", 2);
		
		System.out.printf("%s, %s, %d%n" , c1.color, c1.gearType , c1.door);
		System.out.printf("%s, %s, %d%n" , c2.color, c2.gearType , c2.door);
		

	}

}
