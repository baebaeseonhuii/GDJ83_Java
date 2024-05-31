package com.seonhui.s4;

public class Customer {
	int don;
	int point;

	// 매개변수를 하나만 선언
	public void buy(ElectronicDevices e) {
		// 가진 돈에서 물건의 가격을 뻄
		// 가진 포인트에서 물건의 포인트를 더함
		this.don = this.don - e.price;
		this.point = this.point + e.point;

		System.out.println(don);
		System.out.println(point);
	}
}
