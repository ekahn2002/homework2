import java.util.*;
class B05 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요 ");
		int birth_year = s.nextInt();
		int age = 2012 - birth_year + 1;
		if(age < 7) {
			System.out.print("유아입니다.");
		}
		else if(7 <= age && age < 13) {
			System.out.print("어린이입니다.");
		}
		else if(13 <= age && age < 20) {
			System.out.print("청소년입니다.");
		}
		else if(20 <= age && age < 30) {
			System.out.print("청년입니다.");
		}
		else if(30 <= age && age < 60) {
			System.out.print("중년입니다.");
		}
		else if(60 <= age) {
			System.out.print("노년입니다.");
		}
		else {}
	}
}
