package com.seonhui.s5.date;

public class Single {

	// 싱글톤 기법
	private static Single single;

	int num = 10;

	private Single() {

	}

	public static Single get() { // static은 객체를 안만들고 메소드 사용가능
		// 객체를 자꾸자꾸 안만들고 딱 하나만 만들고싶을 때 생성자에 static쳐넣으면됨
		if (single == null) {
			Single.single = new Single();
		}
		return new Single();
	}

}
