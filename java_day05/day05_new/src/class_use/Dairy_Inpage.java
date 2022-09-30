package class_use;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Dairy_Inpage {
	private static JTextField t1;
	private static JTextField t2;
	
	//멤버메서드 (main을 지우고 open으로 임의지정)
	public static void open() {
	//public static void main(String[] args) {

			JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 228, 202));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lb1 = new JLabel("오늘 날짜");
		lb1.setHorizontalAlignment(SwingConstants.CENTER);
		lb1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lb1.setBounds(65, 52, 106, 52);
		f.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel("오늘 제목");
		lb2.setHorizontalAlignment(SwingConstants.CENTER);
		lb2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lb2.setBounds(65, 137, 106, 52);
		f.getContentPane().add(lb2);

		JLabel lb3 = new JLabel("오늘 내용");
		lb3.setHorizontalAlignment(SwingConstants.CENTER);
		lb3.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		lb3.setBounds(65, 227, 106, 52);
		f.getContentPane().add(lb3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(225, 225, 225));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		t1.setBounds(208, 53, 200, 51);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(225, 225, 225));
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setFont(new Font("G마켓 산스 TTF Medium", Font.BOLD, 20));
		t2.setColumns(10);
		t2.setBounds(208, 138, 200, 51);
		f.getContentPane().add(t2);

		JTextArea t3 = new JTextArea();
		t3.setBackground(new Color(225, 225, 225));
		t3.setBounds(208, 227, 200, 135);
		f.getContentPane().add(t3);
		
		JButton btn1 = new JButton("파일에 일기 저장");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(64, 128, 128));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 파일 만들기
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				
				try {
					//file.txt와 자바프로그램 간 스트림(연결통로) 만듬
					FileWriter file = new FileWriter(s1 + ".txt");
					// 파일에다 쓰기(데이터 보내라)
					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					// 스트림 닫기
					file.close();
				} catch (Exception e1) {
					System.out.println("저장 중 에러발생함!!");
				}
				
			}
		});
		btn1.setIcon(null);
		btn1.setFont(new Font("굴림", Font.BOLD, 20));
		btn1.setBounds(65, 384, 343, 52);
		f.getContentPane().add(btn1);
		
		// vis
		f.setVisible(true);
	}
}