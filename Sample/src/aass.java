import java.util.Scanner;
//3������
public class aass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2�ڸ��� ���� �Է�(10~99)>>");
		int n = scanner.nextInt();
		
		int ten = n / 10;
		int one = n % 10;
		
		System.out.println( ten == one);
	}

}