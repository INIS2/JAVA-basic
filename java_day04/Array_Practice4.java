// 배열 응용 63p
// 값을 배열의 적절한 위치에 넣고, 동시에 출력한다
// 배열과 for문은 짝궁~
package array;

import java.util.Scanner;

public class Array_Practice4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5]; // {0,0,0,0,0}
		
		//입력
		for (int i = 0; i < 5; i++) {			
			System.out.print("숫자입력 >> ");
			num[i] = sc.nextInt(); // 외부입력(String)을 int로 변환
		}
		
		//출력
		for (int x : num) {
			System.out.println(x);
		}
		// System.out.println("저장된 데이터는 " + data);
		
	}
}
