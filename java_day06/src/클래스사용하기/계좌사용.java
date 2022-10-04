package 클래스사용하기;

import 클래스만들기.계좌;

public class 계좌사용 {

	public static void main(String[] args) {
		
		// 불러오기
		계좌 my = new 계좌();
		
		my.이름 = "나";
		my.계좌이름 = "튼튼이 비자금";
		my.금액 = 100000;
		
		my.입금();
		my.출금();
		
		계좌 dad = new 계좌();
		dad.이름 = "아빠";
		dad.계좌이름 = "아빠계좌";
		dad.금액 = 1000000;
		
		dad.입금();
		dad.출금();
		
		계좌 mom = new 계좌();
		mom.이름 = "엄마";
		mom.계좌이름 = "엄마계좌";
		mom.금액 = 999999999;
		
		mom.입금();
		mom.출금();
	}

}
