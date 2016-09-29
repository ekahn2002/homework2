import java.util.*;
class B02 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요 ");
		double input_degree = s.nextInt();
		double output_degree;
		System.out.print("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 ");
		String kind = s.next();
		if(kind.equals("C")) {
			output_degree = input_degree * 1.8 + 32;
			System.out.print("변환된 온도는 " + output_degree + " 입니다.");
		}
		else if(kind.equals("F")) {
			output_degree = (input_degree - 32)/1.8;
			System.out.print("변환된 온도는 " + output_degree + " 입니다.");
		}
		else {
			System.out.print("잘못된 입력입니다.");
		}
	}
}
