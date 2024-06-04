package com.seonhui.s1.lang.wrapper;

import java.util.Scanner;

public class Wrapper3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Identification Number");
		// 970925-1234567
		String jumin = sc.next();
		// 1. 성별 검증 -다음이 홀수: 남자, 짝수: 여자 num%2==0 -> female, num%2==1 -> male
		int dot = jumin.lastIndexOf("-") + 1;
		String result = jumin.substring(dot, dot + 1);
		int n = Integer.parseInt(result);
		if (n % 2 == 0) {
			System.out.println("Female");
		} else {
			System.out.println("Male");
		}
		// 2. 나이 계산 2024-(1900+앞에 두자리)
		String yearStr = jumin.substring(0, 2);

		int r = 1900;
		if (n == 3 || n == 4) {
			r = 2000;
		}

		int year = r + Integer.parseInt(yearStr);
		int age = 2024 - year;
		System.out.println("age: " + age);

		// 3. 주민번호 유효성 검증
		// 9 7 0 9 2 5 - 1 2 3 4 5 6 7(검증용 숫자)
		// *2 *3 *4 *5 *6 *7 *8 *9 *2 *3 *4 *5
		// 18 21 0 45 12 35 8 18 6 12 20 30
		// 총합을 11로 나눈 나머지를 구하기
		// 225%11->5
		// 나머지 11로 뺀 결과값을 검증용 숫자와 같은지 비교
		// 11로 뺀 결과값이 2자리수라면
		// 뺀 결과값을 10으로 나눈 나머지를 검증용 숫자와 비교
		// 10%10 --> 0

		// jumin에서 - 빼기
		char[] nums = new char[13];
		String justNum = jumin.replace("-", "");
		int[] arr = new int[justNum.length()];

		for (int i = 0; i < justNum.length(); i++) {
			String a = justNum.substring(i, i + 1);
			int b = Integer.parseInt(a);
			arr[i] = b;

		}

		int sum = 0;
		for (int i = 0; i < justNum.length() - 1; i++) {
			int a = arr[i] * ((((i + 2) / 10) * 2) + (i + 2) % 10);
			sum = sum + a;

		}

		int remain = sum % 11;
		remain = 11 - remain;
		if (remain >= 10) {
			remain = remain % 10;
		}

		if (remain == arr[12]) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}

	}

}
