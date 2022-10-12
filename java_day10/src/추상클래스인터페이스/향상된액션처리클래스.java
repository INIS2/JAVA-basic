package 추상클래스인터페이스;

public class 향상된액션처리클래스 implements MyAction {

	@Override
	public void click() {
		System.out.println("클릭하면 인터넷으로 연결...");
	}

	@Override
	public void dbClick() {
		System.out.println("화면에 경고 메세지 후, 창 닫기...");
	}

}
