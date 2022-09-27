package window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ChooseBox2 {
	private static JTextField txt1;
	private static JTextField txt2;
	private static JTextField txt3;
	private static JTextField txt4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		txt1 = new JTextField();
		txt1.setBounds(267, 34, 186, 50);
		f.getContentPane().add(txt1);
		txt1.setColumns(10);
		
		txt2 = new JTextField();
		txt2.setColumns(10);
		txt2.setBounds(267, 145, 186, 50);
		f.getContentPane().add(txt2);
		
		txt3 = new JTextField();
		txt3.setColumns(10);
		txt3.setBounds(267, 267, 186, 50);
		f.getContentPane().add(txt3);
		
		txt4 = new JTextField();
		txt4.setColumns(10);
		txt4.setBounds(267, 332, 186, 50);
		f.getContentPane().add(txt4);
		
		JButton btn1 = new JButton("어디로 갈까?");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = txt1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차")) {
					JOptionPane.showMessageDialog(f, "카페가세요");
				} else {
					JOptionPane.showMessageDialog(f, "물이나 마시세요");
				}
			}
		});
		btn1.setBounds(11, 94, 442, 31);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("나의 내년 나이는?");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s2 = txt2.getText();
				JOptionPane.showMessageDialog(f, "당신의 내년 나이는 " + ( Integer.parseInt(s2) + 1 ) + "입니다");
			}
		});
		btn2.setBounds(11, 211, 442, 31);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("두 과목 점수의 평균은?");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s3 = txt3.getText();
				String s4 = txt4.getText();
				int result = (Integer.parseInt(s3) + Integer.parseInt(s4))/2;
				JOptionPane.showMessageDialog(f, result);
				
			}
		});
		btn3.setBounds(11, 392, 442, 31);
		f.getContentPane().add(btn3);
		
		JLabel lblNewLabel = new JLabel("국어 점심");
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel.setBounds(12, 267, 186, 50);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("수학 점수");
		lblNewLabel_1.setBackground(new Color(128, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(11, 332, 186, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("당신의 나이는?");
		lblNewLabel_2.setBackground(new Color(128, 128, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_2.setBounds(11, 145, 186, 50);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("먹고 싶은 음식");
		lblNewLabel_3.setBackground(new Color(128, 128, 128));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_3.setBounds(11, 34, 186, 50);
		f.getContentPane().add(lblNewLabel_3);
		f.setVisible(true);
	}
}
