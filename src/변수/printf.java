package ����;


public class printf {

	public static void main(String[] args) {
		String url = "www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1 = %f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2 = %f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3 = %f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d); // �Ҽ������� 6�ڸ����� �ݿø�
		System.out.printf("d=%14.10f%n", d); // ��ü 14�ڸ� �� �Ҽ��� ���� 10�ڸ�(������ �κ��� 0���� ä��)
		System.out.printf("d=%014.10f%n", d); // ���� �պκ��� 0���� ä��
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); // ��������
		System.out.printf("[%-20s]%n", url); // �������� 
		System.out.printf("[%.8s]%n", url); // ���ʿ��� 8���ڸ� ���
	}

}
