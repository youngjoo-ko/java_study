
package OOP;

public class q6_4 {
	static double getDistance(int x, int y, int x1, int y1) {
		double distance = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
		
		return distance;
	}
	
	
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));

	}

}
