package javabasic;

import javax.swing.JOptionPane;

public class 두번째부품 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자주쓰는 기능을 가진 부품을 대문자로 바로 쓸 수 있도록 준비되어있음
		// Sysyem, JOptionPane, Integer
		
		//prompt(), 입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요");
		//alert() = showMessageDialog
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);
		// 자주 안쓰면 new로 새로 만들어 쓴다.
		// JFrame, Date

		//이름과 취미까지 추가!
		String hobby = JOptionPane.showInputDialog("당신의 취미를 입력하세요");
		JOptionPane.showMessageDialog(null, "나의 취미는 " + hobby);
		
		String name = JOptionPane.showInputDialog("당신의 이름를 입력하세요");
		JOptionPane.showMessageDialog(null, "나의 나이는 " + name);	
		
		
		
	}

}
