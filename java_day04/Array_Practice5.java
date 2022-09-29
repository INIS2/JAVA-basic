// 배열 응용 59p
package array;

import java.util.Scanner;

public class Array_Practice5 {

	public static void main(String[] args) {
		// 1번 문제
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		//입력
		for (int i = 0; i < 5; i++) {			
			System.out.print((i+1) + "번째 숫자입력 >> ");
			num[i] = sc.nextInt(); 
		}
				
		//출력
		System.out.println("1st+3rd = " + (num[0] + num[2]));
		System.out.println();
		
		// 2번 문제
		String[] s = new String[3];
		s[0] = "자바";
		s[1] = "스프링";
		s[2] = "JSP";
		System.out.println(s[0] + "보다는" + s[1]);
		
	}
}
