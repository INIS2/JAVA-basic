
package class_use;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dairy_login {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 228, 202));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lb_top = new JLabel("**DAIRY**");
		lb_top.setIcon(new ImageIcon("C:\\Users\\여원영\\Documents\\JAVA_32\\day05_new\\book.jpg"));
		lb_top.setHorizontalAlignment(SwingConstants.CENTER);
		lb_top.setFont(new Font("굴림", Font.BOLD, 20));
		lb_top.setBounds(46, 36, 367, 117);
		f.getContentPane().add(lb_top);
		
		JLabel lb1 = new JLabel("아이디");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lb1.setBounds(70, 177, 106, 52);
		f.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("비밀번호");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lb2.setBounds(70, 262, 106, 52);
		f.getContentPane().add(lb2);
		
		t1 = new JTextField();
		t1.setBackground(new Color(228, 228, 228));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		t1.setBounds(213, 178, 200, 51);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(228, 228, 228));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(213, 263, 200, 51);
		f.getContentPane().add(t2);
		
		
		JButton btn1 = new JButton("New button");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				//id="root, pw = "1234"
				if(s1.equals("root") && s2.equals("1234")) {
					// Inpage를 띄우기
					// 객체 생성
					Dairy_Inpage diary = new Dairy_Inpage();
					// 메서드 실행
					diary.open();					
				}else {
					JOptionPane.showMessageDialog(f, "로그인 실패");
				};
				
				
				
				
			}
		});
		btn1.setIcon(new ImageIcon("C:\\Users\\여원영\\Documents\\JAVA_32\\day05_new\\login3.jpg"));
		btn1.setFont(new Font("굴림", Font.BOLD, 20));
		btn1.setBounds(65, 342, 140, 73);
		f.getContentPane().add(btn1);
		
		JButton bnt2 = new JButton("New button");
		bnt2.setIcon(new ImageIcon("C:\\Users\\여원영\\Documents\\JAVA_32\\day05_new\\change3.jpg"));
		bnt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				t1.setText("");
				t2.setText("");
				
			}
		});
		bnt2.setFont(new Font("굴림", Font.BOLD, 20));
		bnt2.setBounds(238, 342, 140, 73);
		f.getContentPane().add(bnt2);
		
		// vis
		f.setVisible(true);
	}
}

