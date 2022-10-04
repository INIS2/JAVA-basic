package 클래스만들기;

public class 계좌 {
	
	// 멤버변수
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	
	// 멤버메서드
	public void 입금() {
		System.out.println(이름 + "님이 " + 계좌이름 + "에 " + 금액 + "을 입급하셨습니다");
	}
	public void 출금() {
		System.out.println(이름 + "님이 " + 계좌이름 + "에 " + 금액 + "을 출금하셨습니다");
	}
	

}
