package 연산자.copy;

import javax.swing.JOptionPane;

public class 내년나이계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력
		String age = JOptionPane.showInputDialog("올해 나이 입력");
		
		// 처리
		//age + 1; >>> 1001
		//숫자 변환 필요(like JS's parsa) >> C : 변환 코드를 짬 / JAVA : 숫자변환 부품을 찾음
		int age2 = Integer.parseInt(age);
		int age3 = age2 + 1;
		
		// 출력
		JOptionPane.showMessageDialog(null, "내년 나이는 " + age3);
	}

}
