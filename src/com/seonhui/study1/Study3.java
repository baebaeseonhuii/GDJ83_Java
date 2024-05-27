package com.seonhui.study1;

public class Study3 {
	public static void main(String [] args) {
		//연산자: + - * / %
		// + 산술연산자
		// + 연결연산자: 문자열 + primitive => 문자열
//		System.out.println("1" + 1);
//		System.out.println(1+"1"+1);
//		System.out.println(1+'a'+"1"+1);
		
		//물건을 고름, 총합계가 나옴, 돈을 냄, 결제를 함
		int total = 35760;
		int money = 50000;
		//잔돈 계산
		int change = money-total;
		
		//만원 개수 
		int man = 0;
		int thou = 0;
		int hunni = 0;
		int doce = 0;
		
		man = change/10000;
//		thou = (change-10000*man) / 1000;
//		hunni = change-10000*man-1000*thou / 100;
//		doce = change-10000*man-1000*thou-100*hunni / 10;
		int chon = change%10000/1000;
		
		
		
			
		
		System.out.println("change: " + change);
		System.out.println("만원: " + man);
		System.out.println("천원: " + thou);
		System.out.println("백원: " + hunni);
		System.out.println("십원: " + doce);
		
	}
}
