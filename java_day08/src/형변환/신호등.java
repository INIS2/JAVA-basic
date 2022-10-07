package 형변환;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 신호등 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setBackground(new Color(0, 0, 0));
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		//b1
		JButton b1 = new JButton("빨강신호");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//img라는 라벨을 만든다
			JLabel img = new JLabel();
			//img에 imageicon을 끼는데 그 이름은 r.png이다
			img.setIcon(new ImageIcon("r2.png"));
			//f(프레임)에 img를 넣는다
			f.add(img);
			f.setVisible(true);
			}
		});
		b1.setBackground(new Color(255, 0, 0));
		f.getContentPane().add(b1);
		
		//b2
		JButton b2 = new JButton("노랑신호");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//img라는 라벨을 만든다
			JLabel img = new JLabel();
			//img에 imageicon을 끼는데 그 이름은 y.png이다
			img.setIcon(new ImageIcon("y2.png"));
			//f(프레임)에 img를 넣는다
			f.add(img);
			f.setVisible(true);
			}
		});
		b2.setBackground(new Color(255, 255, 0));
		f.getContentPane().add(b2);

		//b3
		JButton b3 = new JButton("파랑신호");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//img라는 라벨을 만든다
			JLabel img = new JLabel();
			//img에 imageicon을 끼는데 그 이름은 r.png이다
			img.setIcon(new ImageIcon("b2.png"));
			//f(프레임)에 img를 넣는다
			f.add(img);
			f.setVisible(true);
			}
		});
		b3.setBackground(new Color(0, 0, 255));
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}
}
