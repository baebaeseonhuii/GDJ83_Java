package com.seonhui.s4;

public final class Car {// 클래스 선언부에 final 넣으면 상속하지 말고 있는 그대로 사용하라는 뜻
	// 접근지정자 [그외지정자] 데이터타입 변수명
	public static final String company = "abc"; // static붙으면 클래스변수라고 함. 공유하는 변수인에 바꾸지 말라는 뜻

	//
	public final int MAX_PRICE; // (인스턴스변수)멤버변수는 힙에 만들어짐, 메인 프로그램에서 만들어질지 안만들어질지 모름
	// final이 붙은 변수는 대문자로 씀
//	{
//		this.price=30;
//	}

	public Car() {
		this.MAX_PRICE = 30;
	}

	public static void info() { // static이 붙으면 객체가 만들어지지 않고도 쓸 수 있다. 메인메서드가 시작되기도 전에 자리 잡고 있음
		// 공통적으로 쓰는건 static으로 씀
		System.out.println(Car.company);
		// System.out.println(this.price);
		System.out.println("static method");
		// this.info2();
	}

	public final void info2() {// final meaning 이 메서드를 변경하지 마라
		Car.info();
		System.out.println(Car.company);
		final int num = 30; // 상수나 변하지 않는 메서드라는 뜻

	}
}
