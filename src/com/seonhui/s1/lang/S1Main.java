package com.seonhui.s1.lang;

import java.util.Scanner;

public class S1Main {
	// 변수: field
	// Method, Constructor

	public static void main(String[] args) {
		// 1. import를 안해도 되는 경우: 같은 패키지 내에 있는 클래스
		// 2. java.lang 내의 클래스를 사용할 때

		Scanner sc = new Scanner(System.in);

		Object obj = new Object();
		Object obj2 = new Object();
		String n = "sese";
		String n2 = "winter";

		System.out.println(obj.toString());
		System.out.println(n.toString());

		// 참조변수명.멤버들
		n = "seonhuiBae";
		System.out.println(n.charAt(7));
		System.out.println(n.charAt(6));
		System.out.println(n2.charAt(3));
		n2 = "chris";
		System.out.println(n2.charAt(0));
		System.out.println(n.charAt(4));
		System.out.println(n.length());

		System.out.print("문자를 입력하세요: ");
		n = sc.next();

		for (int i = 0; i < n.length(); i++) {
			System.out.println(n.charAt(i));
		}

		System.out.println(n.length() * 1000 + "원입니다.");
	}

}
