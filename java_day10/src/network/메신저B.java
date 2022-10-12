package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저B extends JFrame {
	DatagramSocket socket;
	JTextArea list;
	JTextField input;

	public 메신저B() throws Exception {
		socket = new DatagramSocket(5555);
		setTitle("메신저B");
		setSize(500, 500);
		list = new JTextArea();
		input = new JTextField();

		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);

		list.setBackground(Color.pink);
		input.setBackground(Color.yellow);

		list.setEditable(false); // 채팅창에 뭐 쓰기 불가
		// ActionListener라는 인터페이스 들고온다. 근데 이건 추상메서드 이지않나?
		// 채워서 완전한걸로 만든다 => 익명 클래스
		input.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				list.append("나 > " + input.getText() + "\n"); // input에서 글 들고오고, 엔터

				
				//소켓파트
				try {
					DatagramSocket socket = new DatagramSocket();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					String str = input.getText();
					byte[] data = str.getBytes();
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
				//소켓파트 끝 
				
				input.setText(""); // input에 공백 넣어줌
			}
		});

		setVisible(true);
	}
	
	
	
	public void procces() {
		while(true) {
			try {
				// DatagramSocket socket = new DatagramSocket(7100);
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				System.out.println("upt받을 준비중...");
				socket.receive(packet);
				list.append("너 > " + new String(data) + "\n");

			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		메신저B name = new 메신저B();
		name.procces();
	}

}
// 보내는건 한번 보내고, 받는것은 계속 받아야 함(while)