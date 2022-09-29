// 
// 랜덤 토익 채점기
package array;

import java.util.Random;

public class Array_Practice7 {

	public static void main(String[] args) {
		// 공간 & 랜덤부품
		int [] 답안지 = new int[990];
		int [] 내답안 = new int[990];
		Random r = new Random();
		
		// 각 답안에 숫자 채우기 (1~4)
		for (int i = 0; i < 답안지.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
		}
		
		// 프린트
		System.out.println("번호:\t답안\t내답"); //  \(역슬래쉬) t:탭 만큼 자리띄움
		System.out.println("--------------------");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println((i +1) + "\t" + 답안지[i] + "\t" + 내답안[i]);
		}
		
		// 정답일치 확인
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (답안지[i] == 내답안[i]) {
				jumsu++; // jumsu = jumsu + 1;
			}
		} // 정답 반복 끝!
		
		// 정답일치 프린트
		System.out.println("--------------------");
		System.out.println("점수는 " + jumsu + "점!");
		}
	}
