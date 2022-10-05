package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 정답Checker_02 {
	private static JTextField textField;
	private static JTextField textField_1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("나의 답안 입력");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(42, 38, 386, 60);
		f.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(42, 122, 204, 46);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("입력");
		btnNewButton.setBounds(268, 122, 130, 46);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("진짜 답안 입력");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(42, 223, 386, 60);
		f.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(42, 307, 204, 46);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton_1 = new JButton("입력");
		btnNewButton_1.setBounds(268, 307, 130, 46);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("결과 출력하기");
		btnNewButton_2.setBounds(268, 397, 130, 46);
		f.getContentPane().add(btnNewButton_2);
		
		
		f.setVisible(true);
	}

}
