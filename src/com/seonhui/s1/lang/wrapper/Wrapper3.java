package com.seonhui.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Identification Number");
		// 970925-1234567
		String jumin = sc.next();
		// 1. 성별 검증 -다음이 홀수: 남자, 짝수: 여자 num%2==0 -> female, num%2==1 -> male
		int dot = jumin.lastIndexOf("-");
		String result = jumin.substring(dot + 1);
		int n = Integer.parseInt(result);

		if (n % 2 == 0) {
			System.out.println("Female");
		} else {
			System.out.println("Male");
		}
		// 2. 나이 계산 2024-(1900+앞에 두자리)
		String year = jumin.substring(0, 2);
		int firstTwoNum = Integer.parseInt(year);
		int age = 2024 - (1900 + firstTwoNum);
		System.out.println(age);

	}

}
