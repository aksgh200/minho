
public class aaasss {
	public static void main(String[] args) {
		int num = 12345;
		int total = 0;
		/* 코드 작성 */

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

		System.out.println("각 자리 숫자의 합 : " + total);
	}

}
