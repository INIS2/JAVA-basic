package 형변환;

import java.util.ArrayList;

public class 형변환문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList me = new ArrayList();
		me.add(1000); // Object <(자동형변환)< Integer <(오토박싱)< int
		me.add(189.1);
		me.add(false);
		me.add('남');
		
		// 1. 전체 목록을 프린트
		System.out.println(me); // ToString 이 들어가있음
		
//		for (int i = 0; i < me.size(); i++) {
//			System.out.print(me.get(i) + ", ");
//		}
		
		// 2. 
		int money = (int)me.get(0) + 2000;
		//int <오토언박싱< Integer <강제형변환< Object
		System.out.println("내 돈은  " + money);
		
		//3
		double height = (double)me.get(1) + 10;
		System.out.println("올해의 키는 " + height);
		
		//4
		boolean food = (boolean)me.get(2);
		if(food) {
			System.out.println("배불러요");
		}else {
			System.out.println("배고파요");
		}
		
		//5
		char gender = (char)me.get(3);
		if (gender == '남') {
			System.out.println("주민번호 1,3");
		}else {
			System.out.println("주민번호 2,4");
		}
	
	
	}

}
