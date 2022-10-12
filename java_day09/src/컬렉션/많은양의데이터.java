package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;

public class 많은양의데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		list.add("홍길동");
		list.add("홍길동");
		list.add("홍길동");
		list.add(100);
		list.add(11.1);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		
		// 중복을 제외하고 싶은 경우
		HashSet set = new HashSet();
		
		for (int i = 0; i < list.size(); i++) {
			set.add(list.get(i));
		}
//		set.add(list.get(0));
//		set.add(list.get(1));
//		set.add(list.get(2));
//		set.add(list.get(3));
//		set.add(list.get(4));
		System.out.println(set);
	}

}
