package OOP2;

// 추상 클래스 선언
abstract class Unit2{
	int x,y;
	// 추상 메서드 1개 가지고 있음
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable{
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
}

// Unit2 클래스를 상속받고, Fightable 인터페이스를 구현하는 클래스 생성
class Fighter extends Unit2 implements Fightable {
	// 인터페이스 구현이기 때문에 Fightable이 갖는 추상메서드 모두 구현
	// 인터페이스에선 public 생략이 가능했지만, 클래스에선 불가하므로 써줘야함
	// 오버라이딩(재정의) 규칙 : 조상보다 접근제어자가 좁으면 안됨!
	public void move(int x, int y) {
		System.out.printf("%d, %d으로 이동합니다%n", x, y);
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격합니다");
	}
}

public class Interface_test {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		f.stop();

	}

}
