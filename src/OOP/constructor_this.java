package OOP;

class Car2{
	String color; // 색상
	String gearType; // 변속기 종류- auto, manual
	int door; // 문의 개수
	
	Car2() {
		this("white", "auto", 4); // 두번쨰 생성자 호출
	} 
	
	Car2(String c , String g, int d){
		color = c;
		gearType = g;
		door = d;
	}
	
	Car2(String c){
		this(c, "auto", 4); // 부분적으로 두번째 생성자 호출
	}
}

public class constructor_this {
	public static void main(String[] args) {
		Car2 c1 = new Car2();		
		Car2 c2 = new Car2("blue");
		
		System.out.printf("%s, %s, %d%n" , c1.color, c1.gearType , c1.door);
		System.out.printf("%s, %s, %d%n" , c2.color, c2.gearType , c2.door);
		

	}

}
