package OOP;

class Data {int x;}

public class primitive_param {
	public static void main(String[] args) {
		Data d = new Data(); // 객체 생성, 참조변수 d에 객체의 주소 저장
		d.x = 10; //객체가 가진 멤버변수 x에 10 저장
		System.out.println("main x = " + d.x);
		
		change(d.x); // change 메서드에 10을 복사한후 매개변수로 넘김
		System.out.println("after change, main x = " + d.x); 
		// change 메서드에 기본형 변수의 값(복사한 데이터)을 넘겨주었기 때문에 d가 가리키는 x의 값을 변하지 않음 
	}
		
		static void change(int x) { 
			x=1000; //여기서 x는 지역변수, d가 가진 x와는 다른 변수이다
			System.out.println("change = " + x); // 메서드 내에서 x는 1000으로 변경
		}
		

	

}
