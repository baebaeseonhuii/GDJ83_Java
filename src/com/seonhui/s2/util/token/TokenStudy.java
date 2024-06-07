package com.seonhui.s2.util.token;

import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String names = "winter, 25, iu,26,  hani,27,  철수,28,  영희,30";

		StringTokenizer st = new StringTokenizer(names, ",");
		System.out.println(st.countTokens());

		while (st.hasMoreTokens()) { // token이 더 있냐? -> token이 더 이상 없을 떄까지 반복
			String name = st.nextToken(); // winter, -> iu, -> ...
			String age = st.nextToken(); // 25, -> 26, -> ...
			System.out.println(name.trim());
		}
		String[] n = names.split(","); // 하나하나가 분리된 데이터일 땐 split이 좋음

	}

}
