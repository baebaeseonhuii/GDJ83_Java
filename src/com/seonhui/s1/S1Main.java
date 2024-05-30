package com.seonhui.s1;

import com.seonhui.s2.Korea;

public class S1Main {

	public static void main(String[] args) {
		Korea korea = new Korea();
		korea.setPop(20);
		int p = korea.getPop();
		System.out.println(p);

		korea.setCapital("Seoul");
		String c = korea.getCapital();
		System.out.println(c);

		korea.setFlower("무궁화");
		String f = korea.getFlower();
		System.out.println(f);

	}
}
