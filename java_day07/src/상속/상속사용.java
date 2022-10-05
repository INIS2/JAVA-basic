package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		사람 p = new 사람();
		p.gender = "남자";
		p.name = "클라크";
		
		// 모든 클래스는 묵시적으로 Object의 메서드를 상속받는다.
		System.out.println( p.getClass());
	}

}
