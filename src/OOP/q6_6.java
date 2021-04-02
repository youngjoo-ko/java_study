package OOP;

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	// 인스턴스 변수 x,y를 사용하므로 static을 붙일 수 없음
	double getDistance(int x, int y) {
		double distance = Math.sqrt((this.x-x) * (this.x-x) + (this.y -y)*(this.y -y));
		return distance;
	}
}

public class q6_6 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		
		// p와 2,2 사이의 거리 구하기
		System.out.println(p.getDistance(2, 2));

	}
}
