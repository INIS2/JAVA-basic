package practice;

import javax.swing.JOptionPane;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("통신사 입력");
		String num = JOptionPane.showInputDialog("전화번호 입력");
		String name = JOptionPane.showInputDialog("이름 입력");

		// 처리
		String result = name + "님은 " + tel + "에 " + num;

		// 출력
		JOptionPane.showMessageDialog(null, result + "로 가입되셨습니다.");
	}

}
