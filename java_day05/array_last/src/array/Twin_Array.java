// 2차원 배열
package array;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Twin_Array {

	public static void main(String[] args) {
		// 1차원을 여러개 겹친게 2차원 배열
		// 각 줄마다 갯수를 다르게 줄 수 있다

		JFrame f = new JFrame(); // 맨 바깥으로 일단 프레임 감싸고
		f.setSize(500, 200);

		String[] header = { "a", "b", "c" };
		String[][] contents = { 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" },
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
				{ "1", "2", "3" }, 
		};
		
		// 접근 후 값 수정
		contents[0][0] = "999";
		contents[7][1] = "999";
		

		JTable table = new JTable(contents, header); // J테이블은 (내용 + 헤더)
		JScrollPane scroll = new JScrollPane(table); // 프레임 추가
		f.add(scroll); 
		f.setVisible(true); // visible은 마지막으로
		
		// 출력
		// 1차원 배열 하나당 for문 하나
		// 이중 for문, 중첩 필요
		// contents.length 는 1차원 배열의 개수를 구해줌
		for (int i = 0; i < contents.length; i++) { // 행
			
			for (int j = 0; j < contents[i].length; j++) { // 열
				System.out.print(contents[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
	}

}
