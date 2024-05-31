package com.seonhui.s4;

public class S4Main {

	public static void main(String[] args) {
		// JVM이 시작될 때 "main method"를 찾아서 실행하기 때문에 main이름은 바꾸면 안됨
		// 클래스 변수
		// 클래스명.변수명
		Car.company = "";
		System.out.println(Car.company);

		Car.info();

		System.out.println(Math.E);
		System.out.println(Math.abs(2.0));

	}

}
