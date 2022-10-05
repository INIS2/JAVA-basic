package generic;

import java.util.Date;

public class 시각스레드 extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date);
			// cpu 1초간 stop
			// 자바에서 cpu를 연결
			// 자바에서 외부 자원을 연결할떄는 위험한 상황. 
			// 에러상황을 대비해야 함
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
