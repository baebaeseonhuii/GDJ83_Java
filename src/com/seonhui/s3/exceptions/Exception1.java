package com.seonhui.s3.exceptions;

public class Exception1 {
	public void ex1(int num) throws ArithmeticException, Exception {// catch 문 여러 개 쓰는 거랑 같음 or 다형성이용해서 Exception 하나만
																	// 써도됨

		int n = 20;

		System.out.println(n / num);
	}
}
