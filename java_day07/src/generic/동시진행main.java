package generic;

public class 동시진행main {
	
	
	public static void main(String[] args) {
		동시진행1 진행1 = new 동시진행1();
		동시진행2 진행2 = new 동시진행2();
		동시진행3 진행3 = new 동시진행3();

		진행1.start();
		진행2.start();
		진행3.start();
	}

}
