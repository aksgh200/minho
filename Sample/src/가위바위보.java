
public class 가위바위보 {
	public static void main(String[] args) {
		// 난수
		// 0.0<= X < 1.0
		// 가위 0, 바위 1, 보 2
		double ran = Math.random();
		int com = (int) (ran * 3);
		System.out.println(ran);
		System.out.println(com);
		int player = 1;

		if (player == com) {
			System.out.println("비겼음");

		} else if ((player + 1) % 3 == com) {
			System.out.println("player 패");
		} else {
			System.out.println("player 승!");
		}

	}

}
