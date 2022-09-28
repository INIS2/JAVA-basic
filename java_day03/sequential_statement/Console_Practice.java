package sequential_statement;

import java.util.Scanner;

public class Console_Practice {

	public static void main(String[] args) {
		// p 192 콘솔 순서 연습
		// Intro
		Scanner scan = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		System.out.println("------------------");
		
		// 이름
		System.out.print("이름 입력 >> ");
		String name = scan.next();
		// 나이
		System.out.print("나이 입력 >> ");
		String age = scan.next();
		// 취미
		System.out.print("취미 입력 >> ");
		String hobby = scan.next();
		
		//출력
		System.out.println("------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 이름은 " + age);
		System.out.println("나의 이름은 " + hobby + "입니다!");
		
		
	}

}
