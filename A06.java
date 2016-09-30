import java.util.*;
class A06 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = s.nextLine();
		System.out.print("국어점수 입력 : ");
		int kor = s.nextInt();
		System.out.print("수학점수 입력 : ");
		int math = s.nextInt();
		System.out.print("영어점수 입력 : ");
		int eng = s.nextInt();
		double avg = (kor + math + eng)/3;
		System.out.print(name + "님은\n평균은 " + avg + "이고\n");
		if(avg >= 95) {
			System.out.print("학점은 A+ 입니다.");
		}
		else if(avg < 95 && avg >= 90) {
			System.out.print("학점은 A 입니다.");
		}
		else if(avg < 90 && avg >= 85) {	
			System.out.print("학점은 B+ 입니다.");
	        }
		else if(avg < 85 && avg >= 80) {
			System.out.print("학점은 B 입니다.");
		}
		else if(avg < 80 && avg >= 75) {
			System.out.print("학점은 C+ 입니다.");
		}
		else if(avg < 75 && avg >= 70) {
			System.out.print("학점은 C 입니다.");
		}
		else if(avg < 70 && avg >= 65) {
			System.out.print("학점은 D+ 입니다.");
		}
		else if(avg < 65 && avg >= 60) {
			System.out.print("학점은 D 입니다.");
		}
		else if(avg < 60 && avg >= 0) {
			System.out.print("학점은 F 입니다.");
		}
		else {
			System.out.print("잘못된 학점입니다.");
		}
	}
}
