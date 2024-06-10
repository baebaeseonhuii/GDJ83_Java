package com.seonhui.s3.exceptions;

public class Exception2 {
	public void hap(int n1, int n2) throws Exception {
		// 3자리 수 이상
		// 59, 68
		int h = n1 + n2;

		if (h > 99) {
			throw new MyException("3자리수는 모름");
		}

	}
}
