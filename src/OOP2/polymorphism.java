package OOP2;

public class polymorphism {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water(); //water 출력
		car = fe; // (Car)fe 에서 형변환이 생략됨
		fe2 = (FireEngine)car; //조상 -> 자손 형변환, 생략불가
		fe2.water(); // water 출력
	}
}

class Car{
	// 클래스 Car의 인스턴스 변수 2개 
	String color;
	int door;
	
	// 인스턴스 메서드 2개
	void drive() { 
		System.out.println("drive");
	}
	
	void stop() {
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	
	// 인스턴스 메서드
	void water() {
		System.out.println("water");
	}
}
