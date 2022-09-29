// 배열 응용 55p
// random 값으로 로또 내기
package array;

import java.util.Random;

public class Array_Practice6 {

	public static void main(String[] args) {
		
		// 1000개 넣을 공간 만들기
		int[] lotto = new int[6];
		
		// 랜덤 값 만드는 객체 만들기
		Random r = new Random();
		
		// 반복문으로 랜덤값 1000개 배열에 넣기
		// 입력은 for문만, for-each는 출력용
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(32) + 1; //0~31까지 + 1
		}
		
		// 프린트하기
		for (int x : lotto) {
			System.out.print(x + " ");
		}
	}
}
