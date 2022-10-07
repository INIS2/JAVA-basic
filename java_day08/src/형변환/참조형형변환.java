package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {

		// 배열의 단점 : 고정된 크기, 같은 타입만 모을 수 있다.
		// ArrayList : 가변적 크기, 여러가지 크기
		ArrayList list = new ArrayList();
		list.add("홍길동"); // Object <---String
		list.add(100);
		list.add(0.2);
		list.add(true);
		list.add(new JButton());
		System.out.println(list.size()); // 갯수 찾기
		
		// 꺼내보자
		//String name = list.get(0); 오류남
		// String (작) <----- Object(큰) / 강제형변환(다운캐스팅) 해주어야 한다.
		String name = (String) list.get(0); // 홍길동
		// int <--> Integer <-- Object
		//Ingeger,Double, Boolean, Character
		// 부품으로 크게 만들어 놓음
		// 기본형 + 포장 > 포장클래서(Wrapper클래서)
		// 기본형과 포장클래스간에는 자동변황 가능
		// int >>>> Integer: boxing
		// int <<<< Integeer  unboxing
		int age = (int)list.get(1);
		
		
	}

}
