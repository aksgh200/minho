import java.util.Arrays;

public class 로또일등맞추기 {
	public static void main(String[] args) {
		int[] lotto = { 2, 4, 7, 11, 19, 34 };
		int count = 0;

		while (true) {
			int[] my = new int[6];

			//로또 번호6개 (1장) 구매
			for (int i = 0; i < 6; i++) {
				int num = (int) (Math.random() * 45 + 1);
				my[i] = num;
			}
			Arrays.sort(my);
			System.out.println(Arrays.toString(my));
			count++;
			System.out.println("횟수:" + count );
			
			
			// 번호비교
			boolean result =Arrays.equals(lotto, my);
			if(result) {
				System.out.println(Arrays.toString(my));
				break;
			}
			

		}
	}

}
