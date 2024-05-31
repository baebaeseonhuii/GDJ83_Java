package com.seonhui.s3;

public interface Fly extends Landing {

	// 상수 접근지정자는 public만 가능
	// final은 초기화를 해줘야 됨
	// 이탤릭체면 static
	public final static int num = 1;
	String NAME = "abc"; // static이 들어가있음

	// 추상 메서드: 바디없이 헤더만
	// 접근지정자는 public만 가능, 그외지정자는 abstract
	// 다음과 같이 선언할 수 있다
	/*
	 * public abstract void t1(); public int t2(); abstract String t3(int num); void
	 * t4();
	 */

	public abstract void flyAble();

}
