package sequential_statement;

import java.util.Scanner;

public class Console_Practice2 {

	public static void main(String[] args) {
		// Intro
		Scanner sc = new Scanner(System.in);
		System.out.println("나에 대한 정보");
		System.out.println("------------------");

		// 이름
		System.out.print("나의 이름? ");
		String name = sc.next();
		// 나이
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		// 취미
		System.out.print("나의 몸무게는 ");
		double weight = sc.nextDouble();
		// 저녁
		System.out.print("저녁을 먹었나요? ");
		boolean food = sc.nextBoolean();
		sc.nextLine();
		// 취미
		System.out.print("나의 좌우명은 ");
		String leftright = sc.nextLine();
		//line은 엔터를 인식한다.

		// 출력
		System.out.println("------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 내년 키는 " + (height + 10));
		System.out.println("나의 내년 몸무게는 " + (weight - 10));
		System.out.println("나는 저녁을 " + food);
		System.out.println("나의 좌우명은 " + leftright);
	}

}
