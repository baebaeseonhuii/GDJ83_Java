package com.seonhui.study3;

import java.util.Random;

public class StudyReturn {

	// 접근지정자 그외지정자 리턴타입 메서드명([매개변수]){}

	public Test t5(Test t) {// 매개변수의 개수와 순서에 맞춰 값을 줘야 함
		System.out.println(t.level);
		t.level = 200;
		System.out.println(t.level);
		t = new Test();
		t.level = 500;
		return t;
	}

	// 매개변수 선언
	public void t4(int sal) {
		// 월급을 받아서 3.3% 제외한 실수령액 계산
		// 실수령액=월급-(월급*0.033)
		double result = sal - sal * 0.033;
		System.out.println(result);
		sal = 1000000;
	}

	// 리턴 타입에 있어서 제한은 없다
	public int t1() {
		int num = 3;
		if (num % 2 == 0) {
			return 0;
		}
		int num2 = 6;
		int result = num * num2;

		// 리턴의 데이터 개수는 딱 하나만 가능
		return result;
	}

	public void t2() {
		Random random = new Random();
		int num = random.nextInt(10); // 0이상 10 미만의 정수 하나를 랜덤하게 리턴
		if (num % 2 == 0) {
			return;
		} else {
			System.out.println(num);
		}
	}
}
