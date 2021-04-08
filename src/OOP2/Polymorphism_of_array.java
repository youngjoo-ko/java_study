package OOP2;

class Product2{
	int price;
	int bonusPoint;
	
	// 생성자
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product2(){} // 기본생성자
}

class Tv2 extends Product2{
	Tv2(){super(100);}// 조상클래스 생성자 호출, tv가격 100만원으로
	
	//Object 클래스의 toString을 오버라이딩
	public String toString() {return "Tv";}
}

class Computer2 extends Product2{
	Computer2(){ super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product2{
	Audio(){super(50);}
	public String toString() {return "Audio";}

}


class Buyer2{
	int money = 1000; // 소유금액
	int bonusPoint = 0;
	Product2[] cart = new Product2[10]; // 구입한 제품을 저장하기 위한 배열, 크기 10
	int i = 0; // product2 배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p + "를/을 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;  // 구입한 물품 가격 합계
		String itemList = ""; // 구입한 물품 목록
		
		//반복문을 이용해 구입한 물품의 총 가격과 목록을 만든다
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 물품은 " + itemList + "입니다.");
	}
}



public class Polymorphism_of_array {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();

	}

}
