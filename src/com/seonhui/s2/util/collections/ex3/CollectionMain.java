package com.seonhui.s2.util.collections.ex3;

import java.util.List;

public class CollectionMain {

	public static void main(String[] args) {
		Collection1 c1 = new Collection1();
		Collection2 c2 = new Collection2();

		List<Integer> ar = c1.makeList(); // makeList로 ArrayList 먼저 만듦
		c2.useList(ar); // 만든 ar을 c2의 메소드 매개변수로 보냄

		c2.useList(c1.makeList());
	}

}
