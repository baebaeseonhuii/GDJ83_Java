package com.seonhui.s3;

public class Eagle extends Bird implements Fly {

	@Override
	public void flyAble() {

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub

	}

	@Override // annotation = 설명+기능
	public void sleep() {
		System.out.println("서서 잔다");

	}

}
