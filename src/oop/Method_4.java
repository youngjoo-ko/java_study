package oop;

class Method_4 {
	int iv;
	static int cv;
	
	void i_method() {}
	static void s_method() {}
	
	void i_method2() {
		i_method();
		s_method();
		System.out.println(iv);
		System.out.println(cv);
	}
	static void s_method2() {
		//i_method(); //에러 
		s_method();
		//System.out.println(iv); // 에러 , 인스턴스 변수 사용불가
		System.out.println(cv); // 에러 , 인스턴스 변수 사용불가
	}
}
