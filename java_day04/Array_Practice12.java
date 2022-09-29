// 104p
// 영화 앨범 만들기
package array;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array_Practice12 {

	// 전체영역에서 특정한 변수를 사용하려면
	// 클래스 아래에 선언해야한다.
	static int start = 2; // 전역변수

	public static void main(String[] args) {
		// ppt 104
		// 영화제목
		String[] title = { "삼진그룹", "담보", "위플래시", "공조2", "늑대사냥" };

		// 포스터파일(파일이름)
		String[] img = { "삼진그룹.jpg", "담보.jpg", "위플래쉬.jpg", "공조2.jpg", "늑대사냥.jpg" };

		// 평점
		double[] jumsu = { 99.9, 88.9, 77.9, 66.9, 55.9 };

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 202));
		f.setSize(416, 425);

		JLabel top = new JLabel("위플래쉬");
		top.setBackground(Color.YELLOW);
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(top, BorderLayout.NORTH);

		JLabel center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);

		JLabel under = new JLabel("77.9");
		under.setBackground(Color.YELLOW);
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 40));
		f.getContentPane().add(under, BorderLayout.SOUTH);

		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start > 0) {
					// 왼쪽 버튼 클릭시 처리
					// 제목 변경
					start = start - 1; // 1 = 2 -1
					top.setText(title[start]); // title[1]
					under.setText(jumsu[start] + "점");

					// 변경된 이미지 부품 다시 만들고, 가운데 라벨에 이미지 부품을 넣어
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "최고 점수입니다");

				}
			}
		});

		btnNewButton.setBackground(new Color(255, 128, 128));
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);

		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (start < 5) {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start] + "점");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					JOptionPane.showMessageDialog(f, "최저 점수입니다");

				}
			}
		});

		btnNewButton_1.setBackground(new Color(255, 128, 128));
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		f.setVisible(true);

	}
}