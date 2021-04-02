package OOP;

class Student2 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	int getTotal() {
		return (kor + eng + math);
	}
	
	// 평균은 소수점 첫째자리까지 나타내기
	// n째자리까지 나타내는 방법 = 10의 n제곱 곱한후 반올림하고 나누기
	float getAverage() {
		return Math.round(getTotal()/3f * 10) / 10f;
	}
}


public class q6_3 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름: " + s.name);
		System.out.println("총점: " + s.getTotal());
		System.out.println("평균: " + s.getAverage());
	}

}
