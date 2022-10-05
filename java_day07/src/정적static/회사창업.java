package 정적static;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		직원 work2 = new 직원("김길동", 24, "남");
		직원 work3 = new 직원("송길동", 25, "여");
		
		System.out.println(직원.count); // 3
		System.out.println(work1); // 직원 [name=홍길동, age=25, gender=여]
		System.out.println(work2); // 직원 [name=김길동, age=24, gender=남]
		System.out.println(work3); // 직원 [name=송길동, age=25, gender=여]
		System.out.println(직원.getAvg()+ "세"); // 24.666666666666668세
	}

}
