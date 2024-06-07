package com.seonhui.s2.util.collections;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("first");
		hs.add("second");
		hs.add("apple");
		hs.add("second");

		System.out.println(hs);

	}

}
