import java.util.*;
class B01 {
	void input() {
	Scanner s = new Scanner(System.in);
	System.out.print("Input your birth year:");
	int birth_year = s.nextInt();
	this.age = 2016 - year + 1;
	}

	void print() {
	if (age <= 20){
	System.out.print("You are minor.");
	}
	else { 
	System.out.print("You are not minor.");
	}
	public static main(String[] s){
		new B01().print();
	}
}
}
