package 생성자;

public class 통장 {
	// class 아래에 선언 = class전체에서 사용 가능
	// = 멤버 변수 = 전역 변수 = 글로벌 변수(global)
	String name;
	String ssn;
	int money;
	public 통장(String name, String ssn, int money) {
		this.name = name;
		this.ssn = ssn;
		this.money = money;
	}
	
	// class랑 같은 이름
	// 하지만 스택에 쌓이는 영역으로, 멤버변수아님
	// (String n, String s, int m)
	// 할 수도 있지만, 직관적이지않다.
	
}
