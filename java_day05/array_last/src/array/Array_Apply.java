//118p
//배열 응용

package array;

public class Array_Apply {

	public static void main(String[] args) {
		// String sn = "931212-1035715";
		String s ="나는 프로그래머야";
		String s2 ="진짜야";
		
		System.out.println(s + s2); //산술 연산자 X 결합 연산자 O (스트링 결합)
		System.out.println(s.concat(s2)); //스트링 결합
		System.out.println(s.charAt(0)); // (index)위치값으로 문자 1글자 추출
		System.out.println(s.endsWith("야")); // 특정 문자로 끝나는지 확인
		System.out.println(s.substring(3)); // 인덱수 3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); // 인덱스 3~7까지 추출
		System.out.println(s.contains(s2)); // 포함하고 있니?
		System.out.println(s.lastIndexOf("프")); // s중 프 글자 위치는?
		System.out.println(s.toUpperCase());//대문자로
		System.out.println(s.toLowerCase());//소문자로
		System.out.println(s.length());//글자수
		System.out.println(s.replace("나", "너")); // 앞글자를 뒤로 바꾸기
		
		
		
		// p124
		String s3 = " 011-245-1234 ";
		String s4 = s3.trim(); //공백제거
		
		//첫 문자열로 통신사 구분
		String front = s4.substring(0, 3); // 뒤 index는 미만으로 잡음
		if (front.equals("011")) { // switch로 할걸...
			System.out.println("SK");
		}else if(front.equals("019")){
			System.out.println("LG");
		}else {
			System.out.println("Apple");
		}
		
		//둘쨰 문자열로 최신 올드 구분
		if (4 > s4.subSequence(4, 6).length()) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		//전체 문자열로 유효성 검사
		if (10 <= (s4.length()-2)) {
			System.out.println("유효한 전화번호");
		}else {
		System.out.println("유효하지 않은 전화번호");
		}
		
		//119p
		// 스트링을 배열로 끊기
		// 콤마 기준으로 분리
		String food = "감자, 고구마, 양파";
		String[] food_s = food.split(",");
		System.out.println(food_s[0]); // >>> 감자
		
		
	}

}
