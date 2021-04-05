package OOP2;

class Point{
	int x;
	int y;
}

class Circle{
	Point p = new Point(); // 원점을 나타내는 참조변수 p생성, 포함관계
	int r;
}


public class composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.r = 4;
		c.p.x = 2;
		c.p.y = 2;
		System.out.printf("원점 = (%d,%d), 반지름 = %d%n", c.p.x, c.p.y, c.r);

	}

}
