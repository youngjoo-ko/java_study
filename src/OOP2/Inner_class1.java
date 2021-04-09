package OOP2;

class Inner_class1 {
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; // 에러, 인스턴스클래스 내부에 static 변수 선언 불가
		final static int CONST = 100; // 상수이므로 허용 가능
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // static 클래스에서만 static 멤버 정의 가능
	}
	
	void method() {
		class LocalInner{
			int iv = 300;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}

}
