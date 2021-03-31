package OOP;

class Data2 {int x;}

public class reference_param {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data2 d = new Data2(); // 객체 생성, 참조변수 d에 객체의 주소 저장
		d.x = 10; //객체가 가진 멤버변수 x에 10 저장
		System.out.println("main x = " + d.x);
		
		change(d); // change 메서드에 객체 주소를 넘김
		System.out.println("after change, main x = " + d.x); 
		// change 메서드에 참조형 변수(객체의 주소)를 넘겨주었기 때문에 d가 가리키는 x의 값이 1000으로 변함
	}
		
		static void change(Data2 d) { 
			d.x=1000; //여기서 x는 d가 가진 멤버변수 x와 같다
			System.out.println("change = " + d.x); // 메서드 내에서 x는 1000으로 변경
		}
		
}
	
