package OOP2;

class Product{
	int price;
	int bonusPoint;
	
	// 생성자
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv1 extends Product{
	Tv1(){
		super(100); // 조상클래스 생성자 호출, tv가격 100만원으로
	}
	
	//Object 클래스의 toString을 오버라이딩
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){ super(200);}
	public String toString() {return "Computer";}
}
	
class Buyer{
	int money = 1000; // 소유금액
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price){
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를/을 구입하셨습니다.");
	}
}


class Polymorphism_of_param {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1()); //tv 구입
		b.buy(new Computer()); // computer 구입
		
		System.out.println("잔액 = " + b.money);
		System.out.println("보너스점수 = " + b.bonusPoint);
		}
	}
