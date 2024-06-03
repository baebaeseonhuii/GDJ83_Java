package com.seonhui.s1.lang;

public class S5Main {
	public static void main(String[] args) {
		String name = " win  ter ";
		System.out.println(name.length());
		name = name.strip();// 앞뒤 공백 제거, 문자열 사이의 공백은 제거X
		System.out.println(name.length());
		name = name.replace(" ", "");
		System.out.println(name);

		name = "winter-24*Seoul";
		name = name.replace("*", "-");// *을 -로 바꾸는 "전처리 작업" -> parsing(하나의 문자열을 여러 개의 문자열로 바꾸는 작업)
		String[] datas = name.split("-");
		for (int i = 0; i < datas.length; i++) {
			System.out.println(datas[i] + " ");
		}

		String c = String.valueOf(10);// static 붙은 메소드는 객체 생성 필요없이 클래스이름.메서드명

		System.out.println(c);

	}
}
