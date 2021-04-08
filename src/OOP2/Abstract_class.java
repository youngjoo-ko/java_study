package OOP2;

public class Abstract_class {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
		
		for(int i=0; i<group.length; i++) {
			group[i].move(100, 200);
		}

	}

}

abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {/*현재위치에서 정지하는 함수*/}
}


//보병 클래스
class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}
	
	void steamPack() {/*스팀팩을 사용하는 함수*/}
}

// 탱크 클래스
class Tank extends Unit{
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ", y=" + y + "]");
	}
	
	void changeMode() {/* 공격모드 변환 함수 */}
}

// 수송선 클래스
class Dropship extends Unit{
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ", y=" + y + "]");
	}
	
	void load() {/*선택된 대상 태움*/}
	void unload() {/*선택된 대상 내림*/}
}