// 80p
// 여행지 비교 체크
package array;

import java.util.Scanner;

public class Array_Practice10 {

	public static void main(String[] args) {

		// 스캐너 & 빈칸
		Scanner sc = new Scanner(System.in);
		String[] last_y = new String[3];
		String[] this_y = new String[3];

		// 작년 가고 싶었던 곳
		for (int i = 0; i < last_y.length; i++) {
			System.out.println("작년에 가고싶었던 곳 세곳을 입력하세요 : " + i + "번 기입");
			last_y[i] = sc.next();
		}

		// 올해 가고 싶었던 곳
		for (int i = 0; i < this_y.length; i++) {
			System.out.println("올해에 가고싶었던 곳 세곳을 입력하세요 : " + i + "번 기입");
			this_y[i] = sc.next();
		}

		// 일치하는 곳 알려주기
		int result = 0;
		for (int j = 0; j < this_y.length; j++) {
			if (this_y[j].equals(last_y[j])) {
				result++;
			}

		}//for
		
		// 출력
		System.out.println("작년과 일치하는 곳은 " + result + "곳 입니다");

	}
}