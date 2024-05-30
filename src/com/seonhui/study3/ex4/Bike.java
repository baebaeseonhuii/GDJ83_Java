package com.seonhui.study3.ex4;

public class Bike {
	String color;
	int price;

	public Bike(String color, int price) { // 이게(매개변수가 있는 생성자) 있어서 컴파일러는 기본생성자를 안만들어줌
		this.color = color;
		this.price = price;

	}
}
