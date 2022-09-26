package 변수.copy;

public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수
		byte age = 100;
		short wallet = 20000;
		int money = 100000000;
		// long space = 100000000000; // 숫자상으로는 들어가야 하는데, int로 인식중
		long space = 100000000000L; 
		
		// 실수
		double height = 185.5;
		// float weight = 88.8; // 얘도 f 붙여줘야 함
		float weight = 88.8f;
		
		// 1 문자
		char gender = '남';
		
		// 논리
		boolean todayFinished = false;
		
		// 문자열 String
		String name = "홍길동";
		System.out.println(name);
		
		
	}

}
