package 상속활용;

public class 스레드사용2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드1 t1 = new 스레드1();
		스레드2 t2 = new 스레드2();
		
		t1.start();
		t2.start();
	}

}
