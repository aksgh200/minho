
public class aaasss {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		/* �ڵ� �ۼ� */

		total = total + (num % 10);
		num = num / 10;

		total = total + (num % 10);
		num = num / 10;

		total = total + (num % 10);
		num = num / 10;

		total = total + (num % 10);
		num = num / 10;

		total = total + (num % 10);
		num = num / 10;

		System.out.println("�� �ڸ� ������ �� : " + total);
	}

}
