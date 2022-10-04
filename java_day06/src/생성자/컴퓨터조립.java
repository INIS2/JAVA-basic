package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		컴퓨터 pc = new 컴퓨터(500000,"샘성",32);
		System.out.println("가격은 " + pc.가격 + "원 입니다");
		System.out.println("제조회사는 " + pc.제조회사 + "입니다");
		System.out.println("모니터 크기는 " + pc.모니터크기 + "인치 입니다");

		컴퓨터 pc2 = new 컴퓨터(100000,"엘쥐",45);
		System.out.println(pc2);
		// 사실 pc2에는 주소가 들어있다
		// 컴퓨터 클래서에 toString() 매서드를 생성해주면
		// 자동으로 주소대신 주소의 변수값들을 프린트해준다
	}

}
