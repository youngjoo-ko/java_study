package oop2;

public class Constructor_super {

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3);
		System.out.println (p.x + "," + p.y + "," + p.z);
	}
}

class Po{
	int x,y;
	
	Po(int x, int y){
		this.x = x;
		this.y = y;
	}
}


class Point3D extends Po{
	int z;
	
	Point3D(int x, int y, int z){
		super(x,y); // Point2(int x, int y) 생성자 호출
		this.z = z;
	}
}