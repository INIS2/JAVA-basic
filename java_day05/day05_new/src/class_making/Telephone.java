package class_making;

public class Telephone {
	// 공통적인 성질 : 사이즈, 스피커
	// 변수를 사용, 2개
	// 멤버변수(선택된 변수), 값을 넣지 않고 선언만! 
	// 자동 초기화 시켜줌
	// 자동초기화 시켜주는것 >>> 멤버변수 & 배열
	public int size; //0
	public String speaker; //""
	
	// 동작(기능)을 정의 : 통화, 사진찍기
	// 멤버 메서드(함수)
	// JS function 같은 느낌
	public void 통화하다() {
		// 이 안에다 처리내용 씀
		System.out.println("전화기로 통화하다");
	}
	public void 사진을찍다() {
		System.out.println("전화기로 셀카를 찍다");
	}
}
