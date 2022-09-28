package conditional_statements;

public class Conditional_Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 236p if else문
		// 기본형 비교 vs 다르형(참조형)비교
		// 조건이 맞으면 내용으로 처리하고 break를 건다
		// 아래의 조건은 실행 X
		int jumsu = 88;
		
		// String result;
		// 처럼 쓰면 result에 쓰레기값이 들어감,연산도 X 출력도 X 
		// 빈 변수 선언시에는 초기값을 (빈칸or0) 넣어야 함
		String result = "";
		
		if (jumsu >= 90) {
			result = "A 학점";
		} else if ( jumsu >= 85 && jumsu < 90) {
			result = "B+ 학점";
		} else if ( jumsu >= 80 && jumsu < 80) {
			result = "B- 학점";
		} else {
			result = "c 학점";
		}
		
		System.out.println("당신의 학점은 " + result);
		}
}