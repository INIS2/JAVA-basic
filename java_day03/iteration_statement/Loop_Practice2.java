// 숫자 크기 비교
package iteration_statement;

import java.util.Scanner;

public class Loop_Practice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int f_count = 0;
		int b_count = 0;

		while (true) {

			System.out.println("숫자 1");
			int num1 = sc.nextInt();

			System.out.println("숫자 2");
			int num2 = sc.nextInt();

			if (num1 > num2) {
				f_count = f_count + 1;
				System.out.println("앞 숫자가 더 큽니다");
				System.out.println(f_count + "번 앞 숫자가 컸습니다");
			} else if (num1 == num2) {
				System.out.println("두 숫자가 같습니다");
			} else {
				b_count = b_count + 1;
				System.out.println("뒷 숫자가 더 큽니다");
				System.out.println(b_count + "번 뒷 숫자가 컸습니다");
			}

			System.out.println("계속할까요(o), 종료할까요(x)");
			String last = sc.next();
			char last2 = last.charAt(0);
			if (last2 == 'x') {
				// System.exit(0);
				System.out.println("수고하셨습니다");
				break;
			} else {

			}
		} // while
	}// main
} // class
