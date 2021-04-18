package oop;

class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}


	String info() {
		return name + "," + no + "," + kor + "," + eng + "," + math
				+ "," + (kor+eng+math) + "," + (int)((kor+eng+math)/3);
	}
}

class Q6_1{
	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 2, 100, 40, 60);
		
		String str = s.info();
		System.out.println(str);
	}
}