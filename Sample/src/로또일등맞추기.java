import java.util.Arrays;

public class �ζ��ϵ���߱� {
	public static void main(String[] args) {
		int[] lotto = { 2, 4, 7, 11, 19, 34 };
		int count = 0;

		while (true) {
			int[] my = new int[6];

			//�ζ� ��ȣ6�� (1��) ����
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			Arrays.sort(my);
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("Ƚ��:" + count );
			
			
			// ��ȣ��
			boolean result =Arrays.equals(lotto, my);
			if(result) {
				System.out.println(Arrays.toString(my));
				break;
			}
			

		}
	}

}
