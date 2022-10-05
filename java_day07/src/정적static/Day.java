package 정적static;

public class Day {
	// 객체 생성시, 힙영역에 복사될 변수들
	// 변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count; // 전역변수 자동 초기화
	static int worktime;
	
	// 생성자
	public Day(String doing, int time, String location) {
		count++;
		worktime += time; // worktime = worktime + time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	// 일반 메서드는 객체 생성후, 조소로 접근해서 호출해야 한다.
	// 객체 생성과 상관없이 아무때나 구하고 싶다!! >> static으로 만들면 가능!
	public static double getAvg() {
		return worktime / (double)count; 
		// 정수&정수 =정수 / 정수&실수 = 실수 / 일부러 하나 실수로 형변환해서 실수값 유도
		// static 매서드 안에 들어가는 전역변수는 객체 생성없이도 접근 가능해야함 >> static 변수만 가능
	}
	
	
	@Override // ToString 생성
	public String toString() {
		return "나의 하루 [하는 일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
}
