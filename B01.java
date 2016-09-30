import java.util.*;
class B01 {
	void print(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2014 - birth_year + 1;
		if (age < 20) {
			System.out.print("미성년자 입니다.");
		}
		else {
			System.out.print("미성년자가 아닙니다.");
		}
	}
	public static void main(String[] args) {
                new B01().print();
        }
}
