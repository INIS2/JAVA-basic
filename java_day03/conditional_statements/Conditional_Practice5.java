package conditional_statements;

import java.util.Date;
import java.util.Scanner;

public class Conditional_Practice5 {

	public static void main(String[] args) {
		// 247~8p / 1,3번
		
		// 1번
		Scanner sc = new Scanner(System.in);
		System.out.print("패스워드 입력! >> ");
		String pw = sc.next();
		
		// if ( pw == "pass" ) {
		// 위 처럼 쓰면 X, 나가세요가 나옴
		if ( pw.equals("pass")) {
			System.out.println("들어오세요");
		}else {
			System.out.println("나가세요");
		}
		System.out.println("");
		
		// 2번
		
		// Scanner sc2 = new Scanner(System.in);
		// 두번째 sc는 만들 필요가 없다
		
		System.out.println("========================");
		System.out.println("당신이 먹고 싶은 점심 메뉴는? ");
		String lunch = sc.next();
		
		switch (lunch) {
		case "짜장면":
			System.out.println("중국집으로 가요");
			break;
		case "라면":
			System.out.println("분식집으로 가요");
			break;
		case "회":
			System.out.println("횟집으로 가요");
			break;
		default:
			System.out.println("그냥 먹지마요");
			break;
		}

		// 253p
	}
}