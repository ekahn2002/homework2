import java.util.*;
class B03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("날수를 입력하세요 ");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.print("날수에 해당되는 기간은 모두 " + seconds + " 초입니다.\n");
		int m_count = seconds/1000000;
		System.out.print("100만 초가 모두 " + m_count + " 번이나 포함됩니다.");
	}
}
