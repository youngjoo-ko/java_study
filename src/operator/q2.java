package operator;

public class q2 {
	// 사과 바구니 개수 구하기
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 123; // 사과 개수
		int size = 10; // 바구니 크기
		// 사과 123개를 넣을때 필요한 바구니 개수?
		// ceil()은 double 형을 반환한다
		int bucket = (int)Math.ceil(apple/(double)size);
		System.out.println(bucket);
	}
	
}
