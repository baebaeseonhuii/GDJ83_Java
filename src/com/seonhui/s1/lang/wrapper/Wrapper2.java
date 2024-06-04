package com.seonhui.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// 비번 길이는 최소 6글자 이상
		// 대소문자, 숫자 1개 이상이 있어야 함 isDigit()
		Scanner sc = new Scanner(System.in);
		System.out.print("enter password: ");
		String pw = sc.next();
		String result = "bad";

		for (int i = 0; i < pw.length(); i++) {
			char c = pw.charAt(i);
			if (Character.isUpperCase(pw.charAt(i))) {
				result = "good";
				break;
			}

		}
		System.out.println(result);
	}

}
