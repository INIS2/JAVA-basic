// 인기투표 304p
package iteration_statement;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Loop_Practice3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setVisible(true);

		int iu = 0;
		int ive = 0;
		int iku = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			// counter
			System.out.println("투표투표 >>> 아이유(1), 아이브(2), 아이쿠(3) 종료(4)");
			int vote = sc.nextInt();

			if (vote == 4) {
				System.out.println("아이유 " + iu);
				System.out.println("아이브 " + ive);
				System.out.println("아이쿠 " + iku);
				System.out.println("수고하셨습니다");
				break;
			
			} else if (vote == 1) {
				iu = iu + 1;
			} else if (vote == 2) {
				ive = ive + 1;
			} else if (vote == 3){
				// iku = iku + 1; 똑같음
				iku++;
			} else {
				System.out.println("없는 번호입니다");
			}
		} // while
	}// main
} // class

