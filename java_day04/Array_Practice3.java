

package array;

public class Array_Practice3 {

	public static void main(String[] args) {
		
		// 1. int크기 5인 배열 생성
		int[] s = new int[5];
		
		// 2. 배열의 크기 프린트
		System.out.println(s.length);
		
		// 3. 배열의 첫번쨰 위치에 100을 넣어서, 프린트
		s[0] = 100;
		System.out.println(s[0]);
		
		// 4. 배열의 마지막 위치에 500을 넣어서, 프린트
		s[s.length - 1] = 200;
		System.out.println(s[s.length - 1]);

		// 5. 배열의 3번째 위치에 200을 넣어서, 프린트
		s[2] = 500;
		System.out.println(s[2]);
		
		// 6. 전체 데이터를 프린트
		for (int x : s) {
			System.out.println(x);
		}
		
		// 7. 전체 데이터를 인덱스와 함꼐 프린트
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + "," + s[i]);
		}		
	}

}

