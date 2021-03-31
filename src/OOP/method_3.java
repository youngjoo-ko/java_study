package OOP;

class MyMath2 {
	long a,b; // 인스턴스 변수
	
	// 인스턴스 메서드 
	long add() { 
		return a + b;
	}
	
	// 클래스 메서드
	static long add(long a, long b) {
		return a + b;
	}
}

class method_3{
	public static void main(String args[]) {
		MyMath2 mm = new MyMath2();
		mm.a = 10L;
		mm.b = 20L;
		System.out.println(mm.add());
		System.out.println(MyMath2.add(100L, 200L));
	}
}