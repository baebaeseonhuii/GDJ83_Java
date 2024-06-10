package com.seonhui.s2.util.collections.ex3;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
	public List<Integer> makeList() {
		// ArrayList<Integer> ar = new ArrayList<Integer>();
		List<Integer> ar = new ArrayList<Integer>(); // 부모타입에 자식타입을 대입
		ar.add(1);
		ar.add(2);

		return ar;
	}

//	public Map<String, Integer> makeMap() {
//		
//	}
}
