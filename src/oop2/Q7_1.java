package oop2;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; // 선언o, 생성x
	
	//cards 배열에 값을 넣어줘야 함
	SutdaDeck(){
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			// i가 10보다 작으면서 1,3,8 일때 true를 반환, 한쌍에만 k를 붙이기 위해
			// 10보다 작다는 조건을 이용함
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	void shuffle() {
		for(int i=0; i<cards.length; i++) {
			int num = (int)(Math.random() * 20) + 1;
			SutdaCard tmp = cards[i]; // int 타입이 아니다
			cards[i] = cards[num];
			cards[num] = tmp;
		}
	}
	
	SutdaCard pick(int index) {
		return cards[index];
	}
	
	SutdaCard pick() {
		int index = (int)(Math.random() * 20) + 1;
		return cards[index];
	}
	
	
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// toString 오버라이딩, 객체가 생성되면 자동호출 된다
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
}


public class Q7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
