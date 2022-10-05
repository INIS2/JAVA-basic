package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class 정답Checker_01 {
	private static JTextField textField;
	static int my_anwser[] ;
	static int real_anwser[] ;
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("정답 Checker");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(43, 41, 393, 142);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("정답 갯수 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_1.setBounds(43, 245, 198, 54);
		f.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(253, 245, 160, 54);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("정답 비교하러가기");
		btnNewButton.setBounds(43, 321, 372, 86);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}

}
