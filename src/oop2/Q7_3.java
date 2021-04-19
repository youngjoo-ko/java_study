package oop2;

class Product3{
	int price;
	int bonusPoint;
	
	// 조상의 기본생성자 추가
	Product3() {}
	
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv3 extends Product3{
	Tv3() {} 
	// 에러가 나는 이유, 조상의 기본 생성자가 없기 때문, 추가해준다
	
	Tv3(int price){
		super(price);
	}
	
	public String toString() {
		return "Tv";
	}
}

public class Q7_3 {

	public static void main(String[] args) {
		Tv3 t = new Tv3(200);
		Tv3 t2 = new Tv3();
		System.out.println(t.price);
		System.out.println(t.bonusPoint);
		System.out.println(t2.price);
		System.out.println(t2.bonusPoint);
	}

}
