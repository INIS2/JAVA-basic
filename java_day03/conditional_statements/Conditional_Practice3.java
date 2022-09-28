package conditional_statements;

public class Conditional_Practice3 {

	public static void main(String[] args) {
		// 242p
		// Switch~case~ : 정수(long 안됨), 문자1(char), 문자열(String)
		// 간단하지만 제약이 있는 if else문
		// Switch에는 break가 없어서,직접 써줘야 함
		
		String name = "자바";
		
		switch (name) {
		case "자바" :
			System.out.println("1103호로!");
			break;
		case "파이썬" :
			System.out.println("1104호로!");
			break;
		case "리눅스" :
			System.out.println("1105호로!");
			break;
			// default = else (위의 경우가 다 아니면)
		default:
			System.out.println("카운터로 가세요");
			break;
		}
	}
}
