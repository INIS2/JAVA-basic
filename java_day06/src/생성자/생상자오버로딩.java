package 생성자;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 생상자오버로딩 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JFrame f2 = new JFrame("나는제목");
		
		JButton b = new JButton();
		JButton b2 = new JButton("나는 버튼 글자");
		
		Font font = new Font("궁서", 1, 50); // 글자를 나타낼때는 요소지정 필수
		b2.setFont(font); // font는 참조형변수(주소), b2.setFont(주소)
		
		f2.setSize(300, 300);
		f2.add(b2); // f2.add(주소)
		
		f2.setVisible(true);
		
		
	}

}
