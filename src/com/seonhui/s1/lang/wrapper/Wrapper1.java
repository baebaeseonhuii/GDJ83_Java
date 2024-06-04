package com.seonhui.s1.lang.wrapper;

public class Wrapper1 {
	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Double.BYTES);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		Integer i = new Integer("hi");

		int num = 10;
		i = new Integer(num);

		int n = Integer.parseInt("10");
		double d = Double.parseDouble("3.12");
		Long.parseLong("100");

		// wrapper
		num = 10; // integer라는 클래스 타입으로 바꾸고 싶다
		// auto boxing
		Integer n1 = num;

		// auto unboxing (reference type -> primitive type)
		num = n1;

		Double d1 = 3.12;

		n1 = (int) 3.12;

	}
}
