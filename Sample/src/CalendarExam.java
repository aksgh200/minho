import java.util.Calendar;

// 달력 만들기 연습
// 달력 형식에 맞게 출력(for,%)
public class CalendarExam {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		// 실제 월 - 1값을 출력
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println(month);

		// 마지막 날짜(현재5월)
		int max = c.getActualMaximum(Calendar.DATE);
		for (int i = 1; i <= max; i++) {
			// 5월의 모든 일자 출력
			System.out.print(" " + (i < 10 ? "0" + i : i));
			if (i % 7 == 0) {
				System.out.println();
			}
		}

	}

}
