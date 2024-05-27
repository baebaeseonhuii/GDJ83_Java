package com.seonhui.study1;

import java.util.Scanner;

public class Study5 {
	public static void main(String[] args) {
		//산술연산자
		//논리연산자(비교연산자)
		
		int num1 = 1;
		long num2 = 1L;
		
		System.out.println(num1==num2);
		
		String name = "winter";
		String name1 = "winter";
		System.out.println(name == name1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input name");
		String name3 = sc.next();
		System.out.println(name==name3);
		
	}
}
