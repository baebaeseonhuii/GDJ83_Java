package com.seonhui.s3;

public class Tiger extends Animal {
	// method overloading
	// method overriding : 상속받은 메서드를 재정의하는 것
	// 메서드의 선언부(헤더)는 동일하게
	// 접근지정자는 같은 범위나 더 넓은 범위로 수정 가능
	public void sleep() {
		System.out.println("누워자기");
	}

}
