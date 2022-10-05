package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {

	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(300,300);
		f.getContentPane().setLayout(null);
		
		JLabel number = new JLabel("0");
		number.setForeground(new Color(255, 0, 0));
		number.setFont(new Font("굴림", Font.BOLD, 80));
		number.setHorizontalAlignment(SwingConstants.CENTER);
		number.setBounds(71, 79, 148, 121);
		f.getContentPane().add(number);
		
		JButton b1 = new JButton("1 빼기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(Integer.toString(count));
			}
		});
		b1.setBounds(12, 10, 79, 48);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("0으로");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText("0");
			}
		});
		b2.setBounds(103, 10, 79, 48);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("1 더하기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(Integer.toString(count));
			}
		});
		b3.setBounds(195, 10, 79, 48);
		f.getContentPane().add(b3);
		
		f.setVisible(true);
	}
}
