package 추상클래스인터페이스;

public interface MyAction {
	
	// abstract : 추상적인 : 불완전하다는 의미
	// public abstract : 생략가능
	// 일반 변수 사용 불가능, 공유할 목적의 상수만 가능
	public abstract void click(); // 처리 내용은 구현X (추상 매서드)
	public abstract void dbClick(); // 처리 내용은 구현X (추상 매서드)
	
}
