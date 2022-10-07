package 형변환;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. set(중복x)
		HashSet team = new HashSet(); // 중복된거 없애고 나옴
		team.add("디자이너");
		team.add("프로그래머");
		team.add("DB관리자");
		team.add("DB관리자");
		System.out.println(team); 
		
		// 2. queue
		LinkedList milk = new LinkedList<>(); // 없애는거 앞쪽부터
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		// 3. list / ski 문제
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski);
		//원래 등수
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i+1 + "등 " + ski.get(i));
		}
		
		//2등 탈락
		ski.remove(1);
		
		System.out.println("===============");
		//나중 등수
		for (int i = 0; i < ski.size(); i++) {
			System.out.println(i+1 + "등 " + ski.get(i));
		}
		
	}

}
