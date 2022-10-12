package 추상클래스인터페이스;

public class 액션처리클래스 implements MyAction {

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println("그냥 버튼 클릭");
	}

	@Override
	public void dbClick() {
		// TODO Auto-generated method stub
		System.out.println("db 진입..");
	}

}
