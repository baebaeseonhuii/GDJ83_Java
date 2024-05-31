package com.seonhui.s2;

public class MidStudent extends Student {
	// Student Class의 멤버변수들, 메서드들 상속받아서 history만 추가하고 싶을 떄
	// 눈에 안 보이지만 Student 클래스의 변수 메서드가 안에 있음
	private int history;

	public MidStudent() {
		super(10);

	}

	public void midInfo() {
		super.info();
		System.out.println(this.history);// super:부모객체의 멤버변수의 주소를 갖고 있음. 부모꺼 가져오고싶을떄
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

}