package com.seonhui.s2.util.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// Generic : 타입에 제한을 둠(이런 타입만 쓰자)
		// <E> E : 변수

		ArrayList<String> ar = new ArrayList<String>();
		ArrayList<Integer> ar2 = new ArrayList();
		ar.add("first");
//		ar.add(2);
//		ar.add('c');
//		ar.add(true);
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		String name = (String) ar.get(0);

	}

}
