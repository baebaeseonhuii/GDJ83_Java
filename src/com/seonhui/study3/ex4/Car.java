package com.seonhui.study3.ex4;

public class Car {// this는 Car 클래스 객체의 주소임

	String color = "white";
	String brand;
	String company;
	int price = 1000; // 1번

	// 생성자
	// 객체 생성시 딱 한번만 호출

	{
		// 인스턴스 초기화 블럭
		price = 200; // 2번
	}

	public Car() { // Constructor &메서드임
		// 매개변수가 없는 생성자 -> 기본 생성자
//		System.out.println("자동차가 만들어집니다.");
//		this.color = "Black";
//		this.brand = "k3";
//		this.company = "Kia";
//		this.price = 25000000; // 3번 -> 이걸로 출력
		// this() 자기 자신의 또 다른 생성자를 호출
		// this() 생성자 내에서 제일 첫 줄에 위치해야됨
		this(2500);

	}

	// 참조변수 this -> 객체의 주소를 가리킴. 자기 자신의 객체의 주소를 담고 있음.
	// this는 객체 생성시 값이 대입되는 변수
	// 각각의 객체 내에서만 사용 가능
	// this는 생략 가능

	// 지역변수
	public Car(int price) { // 생성자 오버로딩
		// 힙에 저장
//		this.price = price;
//		this.color = "Black";
//		this.brand = "k3";
//		this.company = "Kia";
		this(price, "Black");
	}

	public Car(int price, String color) {
//		this.price = price;
//		this.color = color;
//		this.brand = "k3";
//		this.company = "Kia";
		this(price, color, "k3");
	}

	public Car(int price, String color, String brand) {
		this.price = price;
		this.color = color;
		this.brand = brand;
		this.company = "Kia";
	}

	public void info() {
		System.out.println("info");
		System.out.println(price);
		System.out.println(this.color);
		System.out.println(brand);

	}

}
