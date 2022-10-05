package 상속;

public class 사람 extends Object{ // extends 안썼어도 Object 상속 / 8개 메서드 

		String gender;
		String name;

	public void 잠자다() {
		System.out.println("잠자기");
	}

	public void 먹다() {
		System.out.println("먹기");
	}

	@Override
	public String toString() {
		return "사람 [gender=" + gender + ", name=" + name + "]";
	}
	
}
