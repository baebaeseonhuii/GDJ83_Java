package com.seonhui.s2.util.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {

		// lottery
		// 1-45 : 6개
		Random random = new Random();
		// int num = random.nextInt(45) + 1;
		ArrayList<Integer> list = new ArrayList<Integer>();

//		while(list.size()!=6) {
//			//중복이 안되게 6개의 숫자를 뽑기
//		}

		int[] ar = new int[6];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = random.nextInt(45) + 1;

		}

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}

		HashSet<Integer> hs = new HashSet<Integer>();
		while (hs.size() != 6) {
			hs.add(random.nextInt(45) + 1);
		}
		System.out.println(hs); // Set 자체가 중복되는 값이 들어오면 둘중 하나를 지움

	}

}
