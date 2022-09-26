package practice;

import javax.swing.JOptionPane;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "키 별 적정 몸무게 구하기!");
		String height = JOptionPane.showInputDialog("본인의 키를 넣어주세요");
		Double height2 = Double.parseDouble(height);
		JOptionPane.showMessageDialog(null, "당신의 적정 몸무게는(두구두구)..." + (height2 - 100) * 0.9 + "입니다!");
	}

}
