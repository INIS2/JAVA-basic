// for 반복 연습 3
package iteration_statement;

public class Loop_Practice6 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			//1부터 1씩 증가하면서 10까지 처리
			// System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		
		System.out.println("---------");
		//3~11까지 더하기
		int sum2 = 0;
		for (int i = 3; i <= 11.; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		int sum3 = 0;
		System.out.println("---------");
		for (int i = 33; i <= 222; i = i + 1) {
			sum3 = sum3 +1;
		}
		System.out.println(sum3);
		
		//
		System.out.println("---------");
		int sum4 = 0;
		for (int i = 1; i <= 1000; i = i + 3) {
			if (sum4 >= 100) {
				break;
			}
			if(1 % 5 == 0) {
				continue;
			}
			sum4 = sum4 +i;
		}
		System.out.println(sum4);
	
	}}
