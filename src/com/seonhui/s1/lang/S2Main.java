package com.seonhui.s1.lang;

import java.util.Scanner;

public class S2Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();

		boolean flag = obj1.equals(obj2);
		System.out.println(flag);

		Test t1 = new Test();
		Test t2 = new Test();
		System.out.println(t1 == t2);
		t1.age = 9;
		flag = t1.equals(t2);
		System.out.println(flag);

		String name = "winter";// 상수 구역에 만들어져서 주소는 같다
		System.out.println("이름을 입력하세요.");
		String name2 = sc.next();
		String name3 = "winter";
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name.equals(name2));
		name3 = name3 + name2;
		System.out.println(name3 + name2);
		System.out.println("1" + 1 + 1 + '1');// string 타입은 불변이라 연결할 때마다 새로운 객체가 만들어짐

	}

}
