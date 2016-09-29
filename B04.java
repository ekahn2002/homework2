import java.util.*;
class B04 {
	public static void main(String[] args) {
		int kor=0;
		int eng=0;
		int math=0;
		int total=0;
		double avg=0;
		Scanner s = new Scanner(System.in);
		do{
			System.out.print("국어 점수를 입력하세요 ");
			kor = s.nextInt();
		} while(kor == 0);

		do{
			System.out.print("영어 점수를 입력하세요 ");
			eng = s.nextInt();
		} while(eng == 0);

		do{
			System.out.print("수학 점수를 입력하세요 ");
			math = s.nextInt();
		} while(math == 0);
		
		total = kor + eng + math;
		avg = 1.0*total/3;
		System.out.println("입력하신 점수의 총점은 " + total + " 이고,\n평균은 " + avg + " 입니다.");
		
		if(kor >= 90) {
			System.out.print("국어점수가 우수합니다.\n");
		}
		else {}
		
		if(eng >= 90) {
			System.out.print("영어점수가 우수합니다.\n");
			}
		else {}
		
		if(math >= 90) {
			System.out.print("수학점수가 우수합니다.");
			}
		else {}

	}
}
