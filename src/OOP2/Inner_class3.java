package OOP2;

class Outer {
	int value = 10;
	
	class Inner{
		int value = 20;
		
		void method() {
			int value = 30;
			System.out.println("lv alue = " + value);
			System.out.println("inner value = " + this.value);
			System.out.println("Outer value = " + Outer.this.value);
		}
	}
}


class Inner_class3{
	public static void main(String args[]) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method();
		System.out.println(outer);
		System.out.println(inner);

	}
}