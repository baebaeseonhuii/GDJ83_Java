package com.seonhui.study3.ex1;

public class MonsterMain {
	public static void main(String[] args) {
		Monster m1 = new Monster();
		m1.stamina = 100;
		m1.level = 1;
		m1.species = "Orc";
		m1.name = "민병관";
		m1.exp = 1000;

		System.out.println(m1.species);
		System.out.println(m1.stamina);
		System.out.println(m1.level);
		System.out.println(m1.name);
		System.out.println(m1.exp);

		Ax a1 = new Ax();
		a1.attackRange = 100;
		a1.durability = 50;
		a1.enhancement = 70;
		a1.name = "AXE";
		a1.offensePower = 5;

		System.out.println(a1.attackRange);
		System.out.println(a1.durability);
		System.out.println(a1.enhancement);
		System.out.println(a1.name);
		System.out.println(a1.offensePower);

		m1.ax = a1;
		System.out.println(m1.ax.name);
		a1 = new Ax();
		a1.name = "황금도끼";
		System.out.println(m1.ax.name);

		Monster m2 = new Monster();
		m2.ax = a1;
		System.out.println(m2.ax.name);

	}
}
