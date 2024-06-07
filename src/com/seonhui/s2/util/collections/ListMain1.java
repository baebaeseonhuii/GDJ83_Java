package com.seonhui.s2.util.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain1 {

	public static void main(String[] args) {
		// Collection을 상속받는 것들
		// List
		// Set
		// Map
		ArrayList ar = new ArrayList(); // 몇칸인지 선언할 필요 없이 계속 배열에 추가할 수 있음
		String name = "winter";
		int num = 2;
		ar.add(name);
		ar.add(num); // autoboxing (int -> Ingeter -> object)
		ar.add(3.12); // autoboxing (double -> Double -> object)
		ar.add('a'); // Character 로 autoboxing
		ar.add(false);
		ar.add(num);

		ar.add(1, "test");// insert(every other value is pushed back)
		ar.set(0, 'c');// replace(previous element at 0 is replaced by 'c')

		ar.remove(0);
		ar.remove(2);

		ar.clear();

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		LinkedList lk = new LinkedList(); // 순서 유지 값의 중복 허용
		lk.add("ad");
		// 빈번한 수정, 삽입, 삭제가 많다 -> LinkedList
		// 자료 검색, 찾기, get이 많다 -> ArrayList

	}

}
