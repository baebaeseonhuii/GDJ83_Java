package com.seonhui.study2;

import java.util.Scanner;

public class S2_1 {
	public static void main(String[] args) {
		int[] ar = new int[5];

		// 각 인덱스 번호에 키보드로 입력받아서 저장하기
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ar.length; i++) {

			ar[i] = sc.nextInt();

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

		System.out.println();
		System.out.println("배열의 크기를 입력 ");
		int count = sc.nextInt();
		int[] ar2 = new int[count];
		System.out.println("배열의 크기: " + count);

	}
}
