package ����;


public class constant{
	public static void main(String[] args) {
		final int SCORE = 100;
		// score = 200; ����, ����̹Ƿ�
		boolean power = true;
		byte b = 127; //(-128~127)
		
		int oct = 010; // 8����, 10������ 8
		int hex = 0x10; // 16����, 10������ 16
		System.out.println(oct);
		System.out.println(hex);
		
		long l = 1000_000_000; // int�� ���ͷ� 10��, ���� 100������ �ٲ۴ٸ�
		// ���̻� L�� �ٿ��� ���� 
		long L = 10_000_000_000l; 
		System.out.println(l);
		System.out.println(L);
		
		float f = 3.14f;
		double d = 3.14d;
		double dd = 3.14f; // ���� > ���ͷ��̹Ƿ� ��������
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
	}
}

