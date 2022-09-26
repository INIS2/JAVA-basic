package practice;

import javax.swing.JOptionPane;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "가로세로의 길이로 사각형의 면적을 구하는 프로그램입니다.");
		String garo = JOptionPane.showInputDialog("가로의 길이를 넣어주세요");
		String sero = JOptionPane.showInputDialog("세로의 길이를 넣어주세요");
		int garo2 = Integer.parseInt(garo);
		int sero2 = Integer.parseInt(sero);
		JOptionPane.showMessageDialog(null, "사각형의 면적은..." + garo2 * sero2 + "입니다!");
	}

}
