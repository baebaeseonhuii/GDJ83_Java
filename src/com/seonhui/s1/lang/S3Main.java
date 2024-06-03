package com.seonhui.s1.lang;

public class S3Main {

	public static void main(String[] args) {

		String name = "finfl.pdf";
		int result = 0;

		boolean flag = true;
		while (flag) {
			result = name.indexOf("f", result);
			if (result == -1) {
				break;
			}
			System.out.println(result);
			result++;
		}
		System.out.println("exit");

	}

}
