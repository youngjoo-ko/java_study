package oop2;

public class Inner_class2 {
	class InstanceInner {}
	static class StaticInner {}
	
	// 인스턴스 멤버 간에는 서로 직접 접근이 가능하다
	InstanceInner iv = new InstanceInner();
	// static 멤버 간에는 서로 직접 접근이 가능
	static StaticInner cv = new StaticInner();
	
	// static 메서드 
	static void staticMethod() {
		// static 멤버(메서드)는 인스턴스 멤버에 직접 접근할 수 없다
		// InstanceInner obj1 = new InstanceInner(); // 에러
		StaticInner obj2 = new StaticInner();
		
		// 굳이 접근하려면 아래와 같이 객체를 생성해야 함
		Inner_class2 outer = new Inner_class2();
		System.out.println(outer.new InstanceInner());
	}
	
	// 인스턴스 메서드
	void InstanceMethod() {
		// 인스턴스 멤버(메서드)에서는 인스턴스/스태틱 멤버 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		
		// 지역 클래스는 외부에서 접근 불가
		// LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticMethod();
		//System.out.println(iv); // 에러
		System.out.println(cv);
	}

}
