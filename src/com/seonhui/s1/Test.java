package com.seonhui.s1;

public class Test {

	int num;
	private String name;
	// 접근지정자가 default면 같은 패키지 안에서 멤버변수 사용 가능
	// private면 같은 클래스 안에서만 사용 가능
	// public 이면 다른 패키지에서도 사용 가능

	public void info() {
		System.out.println(this.name);
	}

}
