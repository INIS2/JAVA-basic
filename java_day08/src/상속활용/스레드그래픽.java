package 상속활용;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {

	JLabel count, image, day; // 전역변수로 지정
	카운터스레드2 count2;
	시각스레드2 day2;
	이미지스레드2 image2;
	
	public 스레드그래픽() {
		//f. 할필요 없다. 어차피 나 자신인데
		setSize(800,300);
		// 라벨 자리 만들어 주기
		count = new JLabel("카운터");
		image = new JLabel("이미지");
		day = new JLabel("시각");
		
		Font font = new Font("궁서", Font.BOLD, 30); // font가져오기
		count.setFont(font); //count에 font 넣기
		day.setFont(font); //day에 font 넣기
		
		add(count,BorderLayout.WEST); // count 라벨의 위치지정
		add(image,BorderLayout.EAST); // image 라벨의 위치지정
		add(day, BorderLayout.SOUTH); // day 라벨의  위치지정
		
		setVisible(true);
		count2.start();
		day2.start();
		image2.start();
	}

	public static void main(String[] args) {
		// main은 static이기 때문에 static이없는 생성자 메서드를 활용하자
		스레드그래픽 name = new 스레드그래픽();
	}
	
	//inner class

	public class 시각스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				Date date = new Date();
				day.setText("시각 >> " + date);
				// System.out.println("시각 >> " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {

		@Override
		public void run() {
			String[] list = {"1.png","2.png","3.png","4.png","5.png"};
			for (int i = 0; i < list.length; i++) {
				// System.out.println("이미지 >> " + list[i]);
				//image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public class 카운터스레드2 extends Thread {

		@Override
		public void run() {
			for (int i = 1; i >= 0; i--) {
				count.setText("카운트 >> " + i);
				//System.out.println("카운트 >> " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (i == 0) {
					JOptionPane.showMessageDialog(null, "사용시간이 다 되었습니다.");
					
				} // if
			} // for
		}
	}

}
