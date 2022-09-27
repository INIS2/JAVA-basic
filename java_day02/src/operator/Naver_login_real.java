package operator;

import javax.swing.JOptionPane;

public class Naver_login_real {

	public static void main(String[] args) {

		// 저장된 id/pw
		String id = "root";
		String pw = "pass";
		
		// id pw 입력
		String id2 = JOptionPane.showInputDialog("로그인 id");
		String pw2 = JOptionPane.showInputDialog("로그인 pw");
		
		//String은 기본형이 아니어서 값 비교 연산자를 못 씀
		// id == id2 <No> >>>> id.equals(id2) <Yes>
		if (id.equals(id2) && pw.equals(pw2)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}

}
