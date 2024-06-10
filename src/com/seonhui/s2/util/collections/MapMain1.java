package com.seonhui.s2.util.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>(); // Key->Generic Type,
		System.out.println(map.isEmpty());

		map.put("k1", 1); // int -> Integer: autoboxing
		map.put("k2", 2);

		System.out.println(map.get("k2"));
		System.out.println(map.size());
		System.out.println(map.containsKey("k1"));
		System.out.println(map.containsValue(2));
		System.out.println(map);

		System.out.println();

		map.remove("k2", 2);
		map.clear();// map이라는 객체는 지워지진않지만 안의 요소들(element)은 삭제됨

		Iterator<String> it = map.keySet().iterator();

		while (it.hasNext()) {
			String k = it.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}

	}

}
