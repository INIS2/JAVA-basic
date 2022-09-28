// 정답 맞추기 게임~
package iteration_statement;

import java.util.Random;

import javax.swing.JOptionPane;

public class Loop_Practice1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(100); //100보다 아래로(0~99)
		int count = 0;
		
		// 누적시키는 변수는 반복문 안에 넣지 않음
		
		while (true) { // 무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1; // 간단하게는 count++;(증감연산자, 1씩 증가, 1씩 감소)
			int data2 = Integer.parseInt(data); //88
			if (data2 == target) {
				System.out.println("정답입니다!! 정답은 " + target);
				System.out.println("전체 시도횟수는 " + count + "회");
				// + 무한루프를 끝내는 처리를 해야 함 (break or exit)
				// break;// 이 break는 while의 break. if는 브레이크 필요 없음 
				System.exit(0); // 전체 프로그램 끝내기. 그 다음 넘어갈 필요 없어
			} else {
				System.out.println("정답이 아닙니다 ㅜㅜ");
				System.out.println(count + "회 틀리셨습니다");
				// 크기비교 힌트문
				if (data2 > target) {
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요");
				}
			} 
		} // while
		// while문을 안 끝내면 "Unreachable code"에러가 난다
		// JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요");
	}// main
} // class
