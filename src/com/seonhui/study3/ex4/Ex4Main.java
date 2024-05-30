package com.seonhui.study3.ex4;

public class Ex4Main {

	public static void main(String[] args) {
		// new 생성자 호출

		Car car = new Car(); // Car() -> 생성자
		car.info();
		System.out.println("==============");
		Car car2 = new Car(30, "Blue");
		car2.info();
		System.out.println("==============");
		Car car3 = new Car(300, "Yellow", "K7");
		car3.info();
		System.out.println("==============");
		Bike bike = new Bike("", 0);

	}
}
