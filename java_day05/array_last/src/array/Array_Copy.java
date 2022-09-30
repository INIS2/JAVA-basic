// 125p~
// 배열의 복사
package array;

public class Array_Copy {

	public static void main(String[] args) {
		// 배열의 복사는 깊은 복사 하자!
		// 얕은 복사 = 주소만 복사된다
		// 깊은 복사 = 진짜 값을 복사한다
		
		// 기본 데이터 복사
		int 수학1 = 100;
		int 수학2 = 수학1;
		System.out.println("수학2: " + 수학2);
		System.out.println("수학1: " + 수학1);
		//수학2만 바뀐다면
		수학2 = 90;
		System.out.println("수학2: " + 수학2);
		System.out.println("수학1: " + 수학1);
		// 수학 1의 데이터는 보존
		
		// 참조형 복사 (주소 복사 = 얕은 복사)
		int [] n1 = {100,200,300};
		int [] n2 = n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		// n2만 바꿔도 다 바뀌어버림
		
		
		// 참조형 복사 (깊은 복사)
		int[] n3 = n1.clone();
		System.out.println("n1 : " + n1);
		System.out.println("n3 : " + n3);
		//n3만 바꾸면...
		n3[0] = 400;
		for (int x = 0; x < n1.length; x++) {
			System.out.print(n1[x]+" ");
		}
		System.out.println();
		for (int x = 0; x < n3.length; x++) {
			System.out.print(n3[x]+" ");
		}
		//n3만 바뀜
	}

}
