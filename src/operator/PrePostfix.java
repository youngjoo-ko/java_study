package operator;

public class PrePostfix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5, j=0;
		j = i++;
		System.out.printf("%d %d%n", j, i); //5 6
		j = ++i;
		System.out.printf("%d %d%n", j, i); // 7 7
	}
	
}
