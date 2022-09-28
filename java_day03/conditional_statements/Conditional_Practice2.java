package conditional_statements;

public class Conditional_Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 237p if문
		// 기본형 비교 vs 다르형(참조형)비교
		String data = "ok";
		
		// {}를 써서 한 줄 이상 써지는 공간을 블럭이라 한다
		// if 블럭
		if (data.equals("ok")) {
			System.out.println("긍정");
		}else if (data.equals("no")) {
			System.out.println("부정");
		// else 블럭
		}else {
			System.out.println("잘 모르겠음...");
		}
	}

}
