package 컬렉션;

import java.util.ArrayList;

public class 제너릭프로그램 {

	public static void main(String[] args) {
		//클래스를 만들 때 데이터 타입을 정하지 않고
		// 객체 생성시 데이터타입을 정합
		ArrayList<String> list = new ArrayList<>();
		list.add("스트링1");
		list.add("스트링1");
		list.add("스트링1");
		list.add("스트링1");
		list.add("스트링1");
		list.add("스트링1");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		list2.add(100);
		list2.add(100);
		list2.add(100);
		list2.add(100);
		list2.add(100);
		System.out.println(list2);
	}

}
