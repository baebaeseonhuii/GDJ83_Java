package com.seonhui.s4;

public abstract class Bird { // 클래스 선언부에 abstract가 붙으면 미완성이고 변경할 수 있다는 뜻
	int age;

	public abstract void fly(); // 미완성의 메서드인데 상속받아서 사용하라는 뜻 + 변경하라는 뜻

}
