package OOP;

public class mathod_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyMath mm = new MyMath(); // 마이매쓰 객체 생성
		long  res1 = mm.add(5L, 3L);
		long  res2 = mm.substract(5L, 3L);
		long  res3 = mm.multiply(5L, 3L);
		double  res4 = mm.divide(5L, 3L);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		System.out.println(res4);
	}

}

class MyMath{
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	
	long substract(long a, long b) {return a - b;}
	long multiply(long a, long b) {return a * b;}
	double divide(double a, double b) {return a / b;}
	}
