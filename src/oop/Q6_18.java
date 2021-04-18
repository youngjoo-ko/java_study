package oop;

public class Q6_18 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) return false;

		boolean b = false;
		for(int i=0; i<str.length(); i++) {
			char s = str.charAt(i);
			System.out.println(s);
			if('0'<=s && s<='9') {
				b = true; 
			}
			else {
				b = false;
				break;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		String str = "123";
		System.out.println(isNumber(str));

		String str2 = "ddq";
		System.out.println(isNumber(str2));

	}

}
