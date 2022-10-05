package generic;

public class 동시진행1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.print("$");
		}
	}
}
