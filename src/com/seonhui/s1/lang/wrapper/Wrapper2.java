package com.seonhui.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번 길이는 최소 6글자 이상
		// 대문자, 소문자, 숫자 1개 이상이 있어야 함 isDigit()
		Scanner sc = new Scanner(System.in);
		System.out.print("enter password: ");
		String pw = sc.next();
		String onlyLowerCase = "onlyLowerCase";
		String onlyUpperCase = "onlyUpperCase";
		boolean digitOrNot = false;
		boolean specialSymbol = true;

		for (int i = 0; i < pw.length(); i++) {
			char c = pw.charAt(i);
			if (Character.isUpperCase(pw.charAt(i))) {
				onlyLowerCase = "good";
			} else if (Character.isLowerCase(pw.charAt(i))) {
				onlyUpperCase = "good";
			} else if (Character.isDigit(pw.charAt(i))) {
				digitOrNot = true;
			} else {
				specialSymbol = false;
			}
		}

		if (onlyLowerCase.equals("good") && onlyUpperCase.equals("good") && pw.length() >= 6 && digitOrNot
				&& specialSymbol) {
			System.out.println("yay");

		} else {
			System.out.println("try again");
		}
	}

}
