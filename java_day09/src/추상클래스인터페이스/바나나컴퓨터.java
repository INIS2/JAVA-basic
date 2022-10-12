package 추상클래스인터페이스;

public class 바나나컴퓨터 implements 컴퓨터 {

	@Override
	public void 전원켜기() {
		// TODO Auto-generated method stub
		System.out.println("바나나컴퓨터의 전원을 켭니다");
	}

	@Override
	public void 게임하기() {
		// TODO Auto-generated method stub
		System.out.println("배그를 합니다");
	}

	@Override
	public void 검색하기() {
		// TODO Auto-generated method stub
		System.out.println("네이버에서 검색합니다");
	}

}
