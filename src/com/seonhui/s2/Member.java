package com.seonhui.s2;

public class Member {

	private String name;
	private int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// setter method
	public void setAge(int age) {
		this.age = age;
	}

	// getter method
	public int getAge() {
		return age;
	}

}
