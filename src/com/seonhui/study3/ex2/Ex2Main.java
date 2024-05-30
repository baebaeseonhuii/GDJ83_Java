package com.seonhui.study3.ex2;

public class Ex2Main {
	public static void main(String[] args) {
		Study s1 = new Study();

		int[] ar = { 1, 2, 3 };
		ar = s1.add(ar); // 매개변수로 보내는 값 -> 인자값
		System.out.println(ar.length);

		System.out.println("===========");
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		System.out.println("===========");

		int[] ar2 = { 1, 2, 3, 4 };
		ar2 = s1.remove(ar2);
		System.out.println("ar2의 길이: " + ar2.length);
		for (int i = 0; i < ar2.length; i++) {
			System.out.println(ar2[i]);
		}
	}
}
