package 상속활용;

public class 스레드2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("@");
		try {
			Thread.sleep((long)(Math.random() * 3000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if ( i == 9) {
			System.out.println("<@ 종료>");
		}
		}
	}
}
