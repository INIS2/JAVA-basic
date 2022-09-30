package class_use;

import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Filemaking {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		// 자바 밖의 자원들(네트웨크, db프로그램, 파일, etc)을 연결할 떄는
		// 위험한 상황이 일어날 수 있다.
		// 에러나면 어떻게 해? 어떻게 처리할지를 명시해주어야 한다.
		// 해보고(try) - 잡아줘(cahtch)
		try {
			//file.txt와 자바프로그램 간 스트림(연결통로) 만듬
			FileWriter file = new FileWriter(s1 + ".txt");
			// 파일에다 쓰기(데이터 보내라)
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");
			// 스트림 닫기
			file.close();
		} catch (Exception e) {
			System.out.println("저장 중 에러발생함!!");
		}
	}

}
