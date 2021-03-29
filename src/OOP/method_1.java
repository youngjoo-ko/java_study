package OOP;

public class method_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print99dan();
	}
	
	static void print99dan() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d%n", i,j,i*j);
			}
			System.out.println();
		}
	}
	
	

}
