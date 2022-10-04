package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 중국집주문화면 {
	// 전역별수
	static int count; 
	static final int PRICE = 5000; // 상수는 final을 붙여서 변경 불가능하게!
	
	
	private static JTextField t1;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("중국집 주문화면");
		f.getContentPane().setBackground(new Color(234, 213, 213));
		f.getContentPane().setForeground(new Color(215, 255, 215));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("총 개수 :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(436, 55, 90, 49);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 206));
		t1.setForeground(new Color(0, 0, 255));
		t1.setFont(new Font("굴림체", Font.BOLD, 20));
		t1.setBounds(538, 55, 172, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		center.setIcon(new ImageIcon("start.jpg"));
		center.setHorizontalAlignment(SwingConstants.CENTER);
		center.setBounds(128, 133, 489, 239);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제 금액");
		result.setFont(new Font("굴림", Font.BOLD, 20));
		result.setForeground(new Color(255, 53, 53));
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(128, 373, 489, 36);
		f.getContentPane().add(result);
		
		JLabel orderlist = new JLabel("주문 목록");
		orderlist.setHorizontalAlignment(SwingConstants.CENTER);
		orderlist.setForeground(new Color(255, 53, 53));
		orderlist.setFont(new Font("굴림", Font.BOLD, 20));
		orderlist.setBounds(128, 419, 489, 36);
		f.getContentPane().add(orderlist);
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 주문량을 현재 카운트에 하나 플러스
				count++;
				짬뽕count++;
				// 현재 주문량 변경
				t1.setText(count + "개");
				// center의 이미지 변경
				center.setIcon(new ImageIcon("jjbb2.jpg"));
				// result 라벨에 있는 결제금액 변경
				result.setText("결제금액: " + count * PRICE);
				orderlist.setText("짬뽕" + 짬뽕count + "개, 우동" + 우동count + "개, 짜장" + 짜장count + "개");
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.setBounds(12, 55, 98, 49);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				우동count++;
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("udong2.jpg"));
				result.setText("결제금액: " + count * PRICE);
				orderlist.setText("짬뽕" + 짬뽕count + "개, 우동" + 우동count + "개, 짜장" + 짜장count + "개");
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBounds(141, 53, 98, 49);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("짜장면");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				짜장count++;
				t1.setText(count + "개");
				center.setIcon(new ImageIcon("jajang2.jpg"));
				result.setText("결제금액: " + count * PRICE);
				orderlist.setText("짬뽕" + 짬뽕count + "개, 우동" + 우동count + "개, 짜장" + 짜장count + "개");
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setBounds(272, 53, 98, 49);
		f.getContentPane().add(b3);
		
		
		
		f.setVisible(true);
	}
}
