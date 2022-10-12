package 추상클래스인터페이스;

public class 애플컴퓨터 implements 컴퓨터 {

	@Override
	public void 전원켜기() {
		// TODO Auto-generated method stub
		System.out.println("애플의 전원이 커집니다");
	}

	@Override
	public void 게임하기() {
		// TODO Auto-generated method stub
		System.out.println("롤을 켭니다");
	}

	@Override
	public void 검색하기() {
		// TODO Auto-generated method stub
		System.out.println("구글에서 검색합니다");
	}

}
