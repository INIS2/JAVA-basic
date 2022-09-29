// 배열 만들기 29p
package array;

public class Array_Practice {

	public static void main(String[] args) {
		int[] num = new int[5];
		// num <-- {0,0,0,0,0}, length
		
		System.out.println(num); // num은 참조형 변수(주소)
		
		// 값 대입, 위치값(index)를 이용
		num[0] = 100;
		num[1] = 200;
		
		
		//	System.out.println(num[0]);
		//	System.out.println(num[1]);
		//	System.out.println(num[2]);
		//	System.out.println(num[3]);
		//	System.out.println(num[4]);
		//  lenght 갯수 앞에서 멈추는 1씩 커지는 유한반복? >> for문 쓰자 
		
		//  출력용
		//  fore-each : 하나씩 뒤로가면서 꺼내오는 반복문
		//  i는 int의 역할. 잠깐의 변수. index의 i가 아님
		for (int i : num) {
			System.out.println(i);
		}
		//	입,출력용
		//  c타입의 반복문
		for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
		
			
		}
	}

}