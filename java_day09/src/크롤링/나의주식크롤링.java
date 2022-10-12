// 크롤링연습6의 naver(code)로 붙임
package 크롤링;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의주식크롤링 {
	private static JTextField textField;
	// textArea 어디서든 접근가능하게 전역변수 설정해야함

	static JTextArea textArea;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(208, 208, 255));
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("주식 Code 입력 : ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(88, 272, 210, 39);
		f.getContentPane().add(lblNewLabel);
		
		JTextField textField = new JTextField(); // 바깥에 전역변수 선언 했기에 지움
		textField.setFont(new Font("굴림", Font.BOLD, 20));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBackground(new Color(255, 255, 255));
		textField.setBounds(12, 321, 362, 63);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(230, 230, 230));
		textArea.setBounds(39, 468, 301, 161);
		f.getContentPane().add(textArea);
		
		JButton btn1 = new JButton("삼성전자");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 크롤링연습6의 naver(code)로 
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				textArea.setText(result);
			}
		});
		btn1.setBackground(new Color(181, 255, 255));
		btn1.setFont(new Font("굴림", Font.BOLD, 25));
		btn1.setBounds(88, 29, 210, 63);
		f.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("삼성SDI");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				크롤링.naver("006400");
				String result = 크롤링.naver("006400");
				textArea.setText(result);
			}
		});
		btn2.setBackground(new Color(181, 255, 255));
		btn2.setFont(new Font("굴림", Font.BOLD, 25));
		btn2.setBounds(88, 102, 210, 63);
		f.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("삼성중공업");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				크롤링.naver("010140");
				String result = 크롤링.naver("010140");
				textArea.setText(result);
			}
		});
		btn3.setBackground(new Color(181, 255, 255));
		btn3.setFont(new Font("굴림", Font.BOLD, 25));
		btn3.setBounds(88, 175, 210, 63);
		f.getContentPane().add(btn3);
		
		JButton btn_crawling = new JButton("크롤링 시-작");
		btn_crawling.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String jusic = textField.getText();
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(jusic);
				textArea.setText(result);
			}
		});
		btn_crawling.setFont(new Font("궁서체", Font.BOLD, 25));
		btn_crawling.setBounds(88, 407, 210, 39);
		f.getContentPane().add(btn_crawling);
		f.setSize(400,700);
		
		f.setVisible(true);
	}
}
