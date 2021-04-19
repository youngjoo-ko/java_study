package oop2;

// 추상 클래스 선언
abstract class Unit2{
	int x,y;
	// 추상 메서드 1개 가지고 있음
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다");}
}

interface Fightable{
	void move(int x, int y); // public abstract 생략
	//void attack(Fightable f); // public abstract 생략
	void attack(String f); // 이름 공격을 위해 만들어봄
}

// Unit2 클래스를 상속받고, Fightable 인터페이스를 구현하는 클래스 생성
class Fighter extends Unit2 implements Fightable {
	// 인터페이스 구현이기 때문에 Fightable이 갖는 추상메서드 모두 구현
	// 인터페이스에선 public 생략이 가능했지만, 클래스에선 불가하므로 써줘야함
	// 오버라이딩(재정의) 규칙 : 조상보다 접근제어자가 좁으면 안됨!
	public void move(int x, int y) {
		System.out.println(x + "," + y + "로 이동합니다.");
	}
	public void attack(String f) {
		System.out.println(f + "를 공격합니다");
	}
	
	// 싸울 수 있는 상대 불러오는 메서드 생성
	Fightable getFightable(){
		Fightable f = new Fighter();
		return f;
	}
}

class Fighter2 extends Unit2 implements Fightable{
	String name = "";
	
	Fighter2(String name) {
		this.name = name;
		System.out.println(this.name + "가/이 생성되었습니다."); // 이름생성자		
	}
	
	Fighter2() {} // 기본 생성자
	
	public void move(int x, int y) {
		System.out.println(this.name + "가/이 " + x + "," + y + "로 이동합니다.");
	}
	
	public void attack(String f) {
		System.out.println(this.name + "가/이 " + f + "를 공격하여 -10 데미지를 입혔습니다.");
	}
	
	void rest() {System.out.println(this.name + "가/이 쉬는 중입니다.");}
	
}


public class Interface_test {
	public static void main(String[] args) {
		Unit2 u = new Fighter();
		u.move(200,300);
		u.stop();
		//u.attack(new Fighter()); //에러, unit 클래스에는 attack이 없으므로
		
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter2("테스트 파이터").name);
		f.stop();
		
		Fightable f2 = f.getFightable();
		f2.move(50, 50);
		f2.attack(new Fighter2("테스트 파이터2").name);
		//f2.stop(); // 에러, Fightable 에는 stop이 없기 때문
		
	
		System.out.println();
		Fighter2 f4 = new Fighter2("파이터");
		Fighter2 f5 = new Fighter2("파이터2");
		f4.move(10,20);
		f4.attack(f5.name);
		f4.rest();
	}

}
