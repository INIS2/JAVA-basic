

package array;

public class Array_Practice2 {

	public static void main(String[] args) {

		// 배열을 생성할 때, 값을 이미 알고 있는 경우
		int[] s = {1, 2, 3, 4, 5, 6, 7};
		// 변수의 개수 >>> s 주소 + 값7개 + lenght >> 9개
		System.out.println(s); // s가 저장된 주소? > [I@626b2d4a
		System.out.println(s[0]); // s의 1번값은? > 1
		System.out.println(s[2]); // s의 3번값은? > 3
		System.out.println(s.length); // read only 읽기 전용
		 
		// *******************************************
		// 배열을 생성할 때, 값을 아직 모르고 있는 경우
		int[] s2 = new int[5];
		// 변수의 개수 >>> 7개
		System.out.println(s2); // s2가 저장된 주소? > [I@5e91993f
		System.out.println(s2.length - 1 ); // lenght - 1은 즉 마지막 인덱스의 값  
				
		// *******************************************
		// 빈칸인 s2에는 뭐가 있을까? > 0
		System.out.println(s2[0]); 
		// 쓰레기 값이 아니고 자동으로 초기값을 넣어줌
		// int > 0 / double > 0.0 / boolean > false 
		
		// *******************************************
		// 배열의 각 인데스에 값 대입.
		// 빈칸에 값을 넣어보자!!
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		System.out.println(s2[0]);
		
	}

}

