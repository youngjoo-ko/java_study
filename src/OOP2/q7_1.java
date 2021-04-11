package OOP2;

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
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
}


public class q7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}

	}

}
