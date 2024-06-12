package com.seonhui.s1.lang;

import java.util.Scanner;

public class S4Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "Computer Science";

		String result = name.substring(3);
		// puter Science -> 3번 포함
		result = name.substring(3, 5);
		// pu -> 3번 포함, 5번 미포함
		System.out.println(result);

		System.out.println("파일명을 입력하세요.(확장자 포함)");
		name = sc.next(); /// abc.pdf -> pdf

		// 확장자만 분리
		// jpg,png,gif,jpeg,jiff
		// 입력받은 파일이 이미지인지 아닌지 출력
		int dot = name.lastIndexOf(".");
		result = name.substring(dot + 1);
		if (result.equals("jpg") || result.equals("png") || result.equals("gif") || result.equals("jpeg")
				|| result.equals("jiff")) {
			System.out.println("사진파일입니다.");
		} else {
			System.out.println("사진 파일이 아닙니다.");
		}

	}

}
