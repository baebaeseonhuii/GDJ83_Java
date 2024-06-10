package com.seonhui.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy2 {

	public static void main(String[] args) {
		String name = "a-b-c";
		StringTokenizer st = new StringTokenizer(name);
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken("-"));
		}
		// 참조변수 타입 확인 메소드: instanceOf클래스명

		// List: 순서유지, 중복허용, 배열기반(index)
		// 주요 메소드: add(), get(), remove(),
		// Set: 순서유지X, 중복허용X, 하나씩 조회X(iterator)
		// 주요 메소드: add(), iterator()

		// Generic<Type>: type의 안정성(형변환)

	}

}
