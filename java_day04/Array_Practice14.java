// 영화관 좌석
package array;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Array_Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(550, 750);

		// 레이아웃 푸품 지정
		// 물흐르듯 왼쪽에서 하나씩 붙임 = folwlayout

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

//		JButton b1 = new JButton("좌석1");
//		JButton b2 = new JButton("좌석2");
//		JButton b3 = new JButton("좌석3");.......
//		
//		f.add(b1);
//		f.add(b2);
//		f.add(b3);............

		int[] seat = new int[500]; // {1,1,1,0,0,0,0,0,0,0,0,0,0,0,...}

		for (int i = 0; i < 300; i++) {
			JButton b = new JButton(i + ""); // i값 단독으로는 못들어가는데 ""로 string으로 만들어줌
			f.add(b);

			// 액션 넣기(b.누르면 액션 들어감 > f에 예약완료 뜸)
			b.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand(); // 버튼 위의 글자를 가져다 줌
					JOptionPane.showMessageDialog(f, s + "번 예약완료");
					b.setEnabled(false);
					b.setBackground(Color.red);
					int index = Integer.parseInt(s);
					seat[index] = 1;

					int count = 0;
					for (int j : seat) {
						if (j == 1) {
							count++;
						}
					}

					// 한자리당 금액이 13000원, 결제금액을 출력해주세요
					JOptionPane.showMessageDialog(f, "예약된 좌석은 " + count + "개 " + count * 13000 + "원 입니다.");
				}
			});
		}

		// setvisiable 위에 있는거 보여라!
		// 맨 아래로
		f.setVisible(true);

	}

}
