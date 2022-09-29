// 104p
// 영화 앨범 만들기 >> 실패작
package array;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array_Practice11 {

	// 전체영역에서 특정변수를 아용하려면, 클래스 아래에 선언
	// static 써야함
	static int start = 2; // 전역변수
	
	
	public static void main(String[] args) {
		
		// 영화 제목
		String [] title = {"삼진그룹","담보","위플래시","공조2","늑대사냥"};
		// 포스터파일(파일이름)
		String [] img = {"삼진그룹.jpg","담보.jpg","위플래시.jpg","공조2.jpg","늑대사냥.jpg"};
		// 평점
		double[] jumsu = {99.9, 88.8, 77.3, 65.3, 55.7};
		
		JFrame f= new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 128));
		f.setSize(500,500);
		
		JLabel top = new JLabel("위플래쉬");
		top.setBackground(new Color(255, 255, 255));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		top.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel under = new JLabel("77.3");
		under.setBackground(new Color(255, 255, 255));
		under.setHorizontalAlignment(SwingConstants.CENTER);
		under.setFont(new Font("굴림", Font.BOLD, 35));
		f.getContentPane().add(under, BorderLayout.SOUTH);
		
		JLabel center = new JLabel("");
		center.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		f.setVisible(true);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			// 왼쪽 버튼 클릭시 처리
			// 제목 변경
			public void actionPerformed(ActionEvent e) {
				start = start - 1;; //
				top.setText(title[start]); //title[1]
				under.setText(jumsu[start]+"점");
				
				//변경된 이미지 부품 다시 만들고, 가운데 라벨에 이미지 부품을 넣어
				ImageIcon icon = new ImageIcon(img[start]);
				center.setIcon(icon);
			
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++ ; //
				top.setText(title[start]); //title[1]
				under.setText(jumsu[start]+"점");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
	}
}