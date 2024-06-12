package com.seonhui.s1.lang.buffer;

public class StringBuffer1 {

	public static void main(String[] args) {

		// append string array
		StringBuffer sb = new StringBuffer();
		StringBuilder sb2 = new StringBuilder();

		// winter + iu
		sb.append("winter");
		sb.append("iu");
		sb.append(10);

		String result = sb.toString();
		System.out.println(sb); // append 쓰면 객체가 새로 안만들어지고 누적됨
		System.out.println(result);

	}

}
