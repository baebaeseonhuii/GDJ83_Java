package com.seonhui.study3.ex3;

public class Cal {

	// Method Overloading
	// 같은 이름의 메서드를 여러 개 만듦(new)
	// 매개변수의 타입의 조합이나 개수가 다르면 성립
	// 메서드의 내용이 달라도 상관없음

	public void hap(int n1, int n2) {
		System.out.println(n1 + n2);
	}

	public void hap(int n1, long n2) {
		System.out.println(n1 + n2);
	}

	public int hap(long n1, int n2) {
		System.out.println(n1 + n2);
		return 0;
	}

	public void println() {

	}
}
