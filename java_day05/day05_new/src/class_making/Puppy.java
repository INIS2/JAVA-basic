package class_making;

public class Puppy {
	// 속성=공통성질 : 색, 종류
	// 멤버변수
	public String color;
	public String field;
	
	// 동작 = 기능 : 꼬리 흔들기, 짖기
	// 멤버 메서드
	public void 꼬리흔들기() {
		System.out.println("강아지가 꼬리를 흔들다");
	}
	public void 짖기() {
		System.out.println("강아지가 멍멍짖다");
	}
}
