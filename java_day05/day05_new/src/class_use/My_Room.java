// 집 class로 꾸미기
package class_use;

import class_making.Puppy;
import class_making.Telephone;

public class My_Room {

	public static void main(String[] args) {
		//전화기 한대 넣어보기
		Telephone p1 = new Telephone();
		// p1은 참조형변수(주소)
		System.out.println(p1);
		
		p1.size = 11;
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.speaker = "바나나사";
		p1.통화하다();
		
		// 전화기 1대 추가
		Telephone p2 = new Telephone();
		p2.size = 9;
		p2.speaker = "메론사";
		p2.통화하다();
		
		// 강아지 1마리, 속성, 동작
		Puppy d1 = new Puppy();
		d1.color = "red";
		d1.꼬리흔들기();
	}

}
