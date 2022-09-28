package sequential_statement;

import java.util.Scanner;

public class Console_Practice3 {

	public static void main(String[] args) {
		// Console Practice Start
		// Scanner를 새롭게 만들어서, 이클립스 콘솔뷰에서 입력을 받아보자
		Scanner sc = new Scanner(System.in);
		
		// Scanner는 입력하기전에 뭔 입력해야 할지 프린트 해주자
		System.out.print("이름을 입력: ");
		String name = sc.next(); // 입력을 String으로 받음
		System.out.println("입력받은 이름은 " + name + "입니다");
		
		System.out.print("소속을 입력: ");
		String com = sc.next();
		System.out.println("입력받은 소속은 " + com + "입니다");
	}

}
