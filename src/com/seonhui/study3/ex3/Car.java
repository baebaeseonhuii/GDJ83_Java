package com.seonhui.study3.ex3;

public class Car {

	String color;
	String brand;
	String company;

	// 참조변수 this -> 객체의 주소를 가리킴. 자기 자신의 객체의 주소를 담고 있음.
	// this는 객체 생성시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용 가능
	// this는 생략 가능

	public void info(Car car) {
		System.out.println("info");
		System.out.println(this.color);
		System.out.println(brand);
	}
}
