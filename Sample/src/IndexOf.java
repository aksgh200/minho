
public class IndexOf {
	public static void main(String args[]) {
		String str = " Java 개발자 양성을 통한 취업 연계 과정!!";
		int idx = -1;
		int count = 0;
		while (true) {
			idx = str.indexOf(" ", idx + 1);
			if(idx == -1) break;
			count++;
		}
		count--;
		System.out.println(count);
	}
}
