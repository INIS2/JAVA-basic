package operator;

public class Naver_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id = 1111;
		int pw = 2222;

		int id2 = 1111;
		int pw2 = 3333;
		
		// if의 condition(조건)은 논리데이터가 나와야 함
		// 코드는 최대한 빠르게 끝나는게 좋은거
		// 결론이 빨리나는걸 제일 앞으로 둔다
		// && 연산은 false 나기좋은것이 앞에, 
		if (id == id2 && pw == pw2) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패 ");
		}
	}
}
