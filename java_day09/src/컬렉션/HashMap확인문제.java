package 컬렉션;

import java.util.HashMap;

public class HashMap확인문제 {

	public static void main(String[] args) {

		HashMap cdb = new HashMap();
		cdb.put(100, "김데이");
		cdb.put(200, "김사전");
		cdb.put(300, "김구조");
		cdb.put(400, "김자료");
		System.out.println(cdb);
		
		// 200번 탈퇴, 400번 개명
		cdb.replace(300, "김충성");
		cdb.remove(200);
		System.out.println(cdb);
		
	}

}
