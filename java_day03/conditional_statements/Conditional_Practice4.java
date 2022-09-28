package conditional_statements;

import java.util.Date;

public class Conditional_Practice4 {

	public static void main(String[] args) {
		// 246p
		// Switch~case~ 2
		
		// Date는 java.util & java.sql 두개 있다. 잘 들고 와야함
		// 0이 일요일, 1이 월요일
		Date date = new Date();
		int month = date.getMonth() +1;
		int day = date.getDay();
		
		switch (day) {
		case 0: case 6:
			System.out.println("놀자");
			break;
		default:
			System.out.println("자바 공부하러 가자");
			break;
		}
		
		
		// 계절 판별
		}
	}