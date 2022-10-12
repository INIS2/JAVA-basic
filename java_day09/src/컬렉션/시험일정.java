package 컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class 시험일정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println(test);
		
		test.remove();
		System.out.println("1일차 시험 후 " + test);

		test.remove();
		System.out.println("2일차 시험 후 " + test);
		
		test.remove();
		System.out.println("3일차 시험 후 " + test);
	}

}
