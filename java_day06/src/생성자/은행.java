package 생성자;

public class 은행 {

	public static void main(String[] args) {
		통장 dad = new 통장("홍길동","0505050",10000);
		System.out.println(dad.name);
		System.out.println(dad.ssn);
		System.out.println(dad.money);
	}

}
