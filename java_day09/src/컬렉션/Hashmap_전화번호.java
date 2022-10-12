package 컬렉션;

import java.util.HashMap;

public class Hashmap_전화번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "동생");
		phone.put(4, "친구");
		System.out.println(phone);
		System.out.println(phone.get(1));
		
		//덮어씌움
		phone.put(1, "직장동료");
		System.out.println(phone.get(1));
		
		//지워보기
		phone.remove(1);
		System.out.println(phone);
		
		//대체하기
		phone.replace(2, "아버지");
		System.out.println(phone);
		
		
	}

}
