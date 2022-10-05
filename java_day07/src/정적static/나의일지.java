package 정적static;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용 가능
		Day day1 = new Day("자바공부", 10, "집");
		System.out.println(day1);
		System.out.println(day1.count);
		System.out.println(day1.worktime);
		Day day2 = new Day("여행", 15, "일본");
		System.out.println(day2);
		System.out.println(day2.count);
		System.out.println(day2.worktime);
		Day day3 = new Day("운동", 5, "유도");
		System.out.println(day3);
		System.out.println(day3.count);
		System.out.println(day3.worktime);
		System.out.println("평균시간 >> " + Day.getAvg() + "시간");
	}

}
