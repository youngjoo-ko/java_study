package oop;

class Data3 {int x;}

public class Reference_return {

	public static void main(String[] args) {
		Data3 d = new Data3(); // 객체 생성, 참조변수 d에 객체의 주소 저장
		d.x = 10; //객체가 가진 멤버변수 x에 10 저장

		Data3 d2 = copy(d); // 객체의 주소 복사후 매개변수로 넘김
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
	}
		
		static Data3 copy(Data3 d) { 
			Data3 tmp = new Data3();
			tmp.x = d.x; // 새로운 참조변수 tmp의 멤버변수 x에 d의 멤버변수 x를 복사함
			return tmp;// 복사한 객체의 주소 반환
		}

}
